package org.tlauncher.statistics.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tlauncher.statistics.model.RunCounter;
import org.tlauncher.statistics.repository.RunCounterRepository;


import java.sql.Timestamp;
import java.util.Date;

@Service
public class RunCounterService {



    @Autowired
    private RunCounterRepository repository;



    public void save(RunCounter runCounter, int count) {
        runCounter.setDate(new Timestamp(new Date().getTime()));
        runCounter.setCount(count);
        repository.save(runCounter);
    }
}
