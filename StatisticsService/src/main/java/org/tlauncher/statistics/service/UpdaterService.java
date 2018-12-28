package org.tlauncher.statistics.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tlauncher.statistics.model.Updater;
import org.tlauncher.statistics.repository.UpdaterRepository;

import javax.servlet.http.HttpServletRequest;

@Service
public class UpdaterService {
    @Autowired
    private GeoLocationService geoLocationService;
    @Autowired
    private UpdaterRepository repository;

    public void save(Updater updater, HttpServletRequest request) {
        updater.setCountry(geoLocationService.defineCountry(request.getRemoteAddr()));
        repository.save(updater);

    }

}
