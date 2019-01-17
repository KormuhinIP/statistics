package org.tlauncher.statistics.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.tlauncher.statistics.model.ServerPageVersion;

@Component
public interface ServerPageVersionRepository extends CrudRepository<ServerPageVersion, Long> {
}


