package org.tlauncher.statistics.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.tlauncher.statistics.controller.RunCounterController;
import org.tlauncher.statistics.model.RunCounter;

@Service
public class Scheduler {


    @Autowired
    private RunCounterService service;

    @Autowired
    private RunCounterController controller;

    @Scheduled(cron = "* */10 * * * *")
    public void runCounterSave() {
        service.save(new RunCounter(),controller.getCount());

    }


}


