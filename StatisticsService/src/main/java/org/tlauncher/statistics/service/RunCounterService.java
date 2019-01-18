package org.tlauncher.statistics.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tlauncher.statistics.model.RunCounter;
import org.tlauncher.statistics.repository.RunCounterRepository;

import java.sql.Timestamp;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;



@Service
public class RunCounterService {


    private AtomicInteger count = new AtomicInteger(0);

    @Autowired
    private RunCounterRepository repository;


    public void save(RunCounter runCounter) {
        runCounter.setDate(new Timestamp(new Date().getTime()));
        runCounter.setCount(count.get());
        repository.save(runCounter);
        count = new AtomicInteger(0); //reset the counter every time the scheduler calls
    }

    public void incrementCounter() {
        count.getAndIncrement();
    }
}
