package org.tlauncher.statistics.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.tlauncher.statistics.model.Updater;

@Component
public interface UpdaterRepository extends CrudRepository<Updater, Long> {
}


