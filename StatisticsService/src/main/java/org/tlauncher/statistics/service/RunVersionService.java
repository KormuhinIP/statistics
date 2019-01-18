package org.tlauncher.statistics.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tlauncher.statistics.model.RunVersion;
import org.tlauncher.statistics.repository.RunVersionRepository;

import java.sql.Timestamp;
import java.util.Date;

@Service
public class RunVersionService {


    @Autowired
    private RunVersionRepository repository;


    public void saveVersion(String version) {
        RunVersion runVersion = new RunVersion();
        runVersion.setVersion(version);
        runVersion.setDate(new Timestamp(new Date().getTime()));
        repository.save(runVersion);
    }
}
