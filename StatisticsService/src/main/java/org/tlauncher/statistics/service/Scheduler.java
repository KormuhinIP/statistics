package org.tlauncher.statistics.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.tlauncher.statistics.model.AdyoutubeCounter;
import org.tlauncher.statistics.model.RunCounter;

@Service
public class Scheduler {


    @Autowired
    private RunCounterService service;

    @Autowired
    private AdyoutubeCounterService counterService;



    @Scheduled(cron = "0 */10 * * * *")
    public void runCounterSave() {
        service.save(new RunCounter());
    }

    @Scheduled(cron = "0 */10 * * * *")
    public void adyoutubeCounterSave() {
        counterService.save(new AdyoutubeCounter());
    }

}


