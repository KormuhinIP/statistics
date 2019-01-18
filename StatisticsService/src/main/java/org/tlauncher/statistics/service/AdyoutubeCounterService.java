package org.tlauncher.statistics.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tlauncher.statistics.model.AdyoutubeCounter;
import org.tlauncher.statistics.repository.AdyoutubeCounterRepository;

import java.sql.Timestamp;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;



@Service
public class AdyoutubeCounterService {


    private AtomicInteger count = new AtomicInteger(0);

    @Autowired
    private AdyoutubeCounterRepository repository;


    public void save(AdyoutubeCounter adyoutubeCounter) {
        adyoutubeCounter.setDate(new Timestamp(new Date().getTime()));
        adyoutubeCounter.setCount(count.get());
        repository.save(adyoutubeCounter);
        count = new AtomicInteger(0); //reset the counter every time the scheduler calls
    }

    public void incrementCounter() {
        count.getAndIncrement();
    }
}
