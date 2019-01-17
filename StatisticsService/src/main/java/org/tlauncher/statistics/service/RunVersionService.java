package org.tlauncher.statistics.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tlauncher.statistics.model.RunVersion;
import org.tlauncher.statistics.repository.RunVersionRepository;

@Service
public class RunVersionService {

    @Autowired
    private RunVersionRepository repository;

    public void save(RunVersion runVersion) {
        repository.save(runVersion);

    }

}
