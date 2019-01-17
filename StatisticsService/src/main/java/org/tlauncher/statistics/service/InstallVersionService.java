package org.tlauncher.statistics.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tlauncher.statistics.model.InstallVersion;
import org.tlauncher.statistics.repository.InstallVersionRepository;


@Service
public class InstallVersionService {

    @Autowired
    private InstallVersionRepository repository;

    public void save(InstallVersion version) {

        repository.save(version);

    }

}
