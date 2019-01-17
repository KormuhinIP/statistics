package org.tlauncher.statistics.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.tlauncher.statistics.model.ServerAdditionalVersion;

@Component
public interface ServerAdditionalVersionRepository extends CrudRepository<ServerAdditionalVersion, Long> {
}


