package org.tlauncher.statistics.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.tlauncher.statistics.model.RunCounter;

@Component
public interface RunCounterRepository extends CrudRepository<RunCounter, Long> {
}


