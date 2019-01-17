package org.tlauncher.statistics.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.tlauncher.statistics.model.InstallVersion;

@Component
public interface InstallVersionRepository extends CrudRepository<InstallVersion, Long> {
}


