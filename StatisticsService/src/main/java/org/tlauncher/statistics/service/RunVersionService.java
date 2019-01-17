package org.tlauncher.statistics.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tlauncher.statistics.model.RunVersion;
import org.tlauncher.statistics.repository.RunVersionRepository;

import java.sql.Timestamp;
import java.util.Date;

@Service
public class RunVersionService {
    private String version;

    @Autowired
    private RunVersionRepository repository;


    public void save() {
        RunVersion runVersion = new RunVersion();
        runVersion.setVersion(version);
        runVersion.setDate(new Timestamp(new Date().getTime()));
        repository.save(runVersion);
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
