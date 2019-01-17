package org.tlauncher.statistics.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.tlauncher.statistics.model.UniqueClient;

@Component
public interface UniqueClientRepository extends CrudRepository<UniqueClient, Long> {
}


