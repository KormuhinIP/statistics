package org.tlauncher.statistics.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.tlauncher.statistics.service.AdyoutubeCounterService;



@Controller
public class AdyoutubeCounterController {
    @Autowired
    private AdyoutubeCounterService service;


    @RequestMapping(value = "/save/adyoutube", method = RequestMethod.POST)
    public ResponseEntity<String> adyoutubeCounter() {
        service.counter();
        return ResponseEntity.accepted().build();
    }

}