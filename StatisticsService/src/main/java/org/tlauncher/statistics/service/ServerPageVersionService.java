package org.tlauncher.statistics.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tlauncher.statistics.model.ServerPageVersion;
import org.tlauncher.statistics.repository.ServerPageVersionRepository;

@Service
public class ServerPageVersionService {

    @Autowired
    private ServerPageVersionRepository repository;

    public void save(ServerPageVersion serverPageVersion) {
        repository.save(serverPageVersion);

    }

}
