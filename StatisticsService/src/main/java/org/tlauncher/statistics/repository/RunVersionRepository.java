package org.tlauncher.statistics.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.tlauncher.statistics.model.RunVersion;

@Component
public interface RunVersionRepository extends CrudRepository<RunVersion, Long> {
}


