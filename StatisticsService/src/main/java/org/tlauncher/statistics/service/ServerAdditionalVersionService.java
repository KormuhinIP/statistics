package org.tlauncher.statistics.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tlauncher.statistics.model.ServerAdditionalVersion;
import org.tlauncher.statistics.repository.ServerAdditionalVersionRepository;

@Service
public class ServerAdditionalVersionService {

    @Autowired
    private ServerAdditionalVersionRepository repository;

    public void save(ServerAdditionalVersion serverAdditionalVersion) {
        repository.save(serverAdditionalVersion);

    }

}
