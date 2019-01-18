package org.tlauncher.statistics.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tlauncher.statistics.model.UniqueClient;
import org.tlauncher.statistics.repository.UniqueClientRepository;


@Service
public class UniqueClientService {

    @Autowired
    private UniqueClientRepository repository;

    public void save(UniqueClient uniqueClient) {

        repository.save(uniqueClient);

    }

}
