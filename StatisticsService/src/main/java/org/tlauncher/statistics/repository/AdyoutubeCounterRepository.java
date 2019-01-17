package org.tlauncher.statistics.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.tlauncher.statistics.model.AdyoutubeCounter;

@Component
public interface AdyoutubeCounterRepository extends CrudRepository<AdyoutubeCounter, Long> {
}


