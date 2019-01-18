package org.tlauncher.statistics.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tlauncher.statistics.model.ServerAdditionalVersion;
import org.tlauncher.statistics.repository.ServerAdditionalVersionRepository;

import java.sql.Timestamp;
import java.util.Date;

@Service
public class ServerAdditionalVersionService {


    @Autowired
    private ServerAdditionalVersionRepository repository;


    public void saveAdditionalVersionId(String additionalVersionId) {
        ServerAdditionalVersion serverAdditionalVersion = new ServerAdditionalVersion();
        serverAdditionalVersion.setAdditionalVersionId(additionalVersionId);
        serverAdditionalVersion.setDate(new Timestamp(new Date().getTime()));
        repository.save(serverAdditionalVersion);
    }
}


