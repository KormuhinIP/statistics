package org.tlauncher.statistics.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tlauncher.statistics.model.ServerPageVersion;
import org.tlauncher.statistics.repository.ServerPageVersionRepository;

import java.sql.Timestamp;
import java.util.Date;

@Service
public class ServerPageVersionService {


    @Autowired
    private ServerPageVersionRepository repository;

    public void savePageVersionId(String pageVersionId) {
        ServerPageVersion serverPageVersion = new ServerPageVersion();
        serverPageVersion.setPageVersionId(pageVersionId);
        serverPageVersion.setDate(new Timestamp(new Date().getTime()));
        repository.save(serverPageVersion);
    }
}
