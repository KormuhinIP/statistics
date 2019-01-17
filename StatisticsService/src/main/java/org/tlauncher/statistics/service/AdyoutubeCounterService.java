package org.tlauncher.statistics.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tlauncher.statistics.model.AdyoutubeCounter;
import org.tlauncher.statistics.repository.AdyoutubeCounterRepository;

import java.sql.Timestamp;
import java.util.Date;

@Service
public class AdyoutubeCounterService {


    @Autowired
    private AdyoutubeCounterRepository repository;


    public void save(AdyoutubeCounter adyoutubeCounter, int count) {
        adyoutubeCounter.setDate(new Timestamp(new Date().getTime()));
        adyoutubeCounter.setCount(count);
        repository.save(adyoutubeCounter);
    }
}
