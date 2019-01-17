package org.tlauncher.statistics.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.concurrent.atomic.AtomicInteger;

@Controller
public class AdyoutubeCounterController {


    private AtomicInteger count = new AtomicInteger(0);

    @RequestMapping(value = "/save/adyoutube", method = RequestMethod.POST)
    public ResponseEntity<String> adyoutubeCounter() {
        count.getAndIncrement();
        return ResponseEntity.accepted().build();
    }

    public int getCount() {
        return count.get();
    }
}