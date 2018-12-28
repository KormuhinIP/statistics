package org.tlauncher.statistics.service;

import com.maxmind.db.Reader;
import com.maxmind.geoip2.DatabaseReader;
import com.maxmind.geoip2.exception.GeoIp2Exception;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.IOException;
import java.net.InetAddress;

@Component
public class GeoLocationService {

    private static DatabaseReader reader = null;
    private final Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private ResourceLoader resourceLoader;

    String defineCountry(String address) {
        try {
            return reader.country(InetAddress.getByName(address)).getCountry().getName();
        } catch (GeoIp2Exception | IOException e) {
            logger.debug("", e);
        }
        return null;
    }

    @PostConstruct
    public void init() {
        try {
            logger.info("GeoLocationServiceImpl: Trying to load GeoLite2-Country database...");

            Resource resource = resourceLoader.getResource("classpath:GeoLite2-Country.mmdb");

            // Initialize the reader
            reader = new DatabaseReader
                    .Builder(resource.getInputStream())
                    .fileMode(Reader.FileMode.MEMORY)
                    .build();

            logger.info("GeoLocationServiceImpl: Database was loaded successfully.");

        } catch (IOException | NullPointerException e) {
            logger.error("Database reader cound not be initialized. ", e);
        }
    }

    @PreDestroy
    public void preDestroy() {
        if (reader != null) {
            try {
                reader.close();
            } catch (IOException e) {
                logger.error("Failed to close the reader.");
            }
        }
    }
}
