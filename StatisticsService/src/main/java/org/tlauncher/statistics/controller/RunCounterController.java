package org.tlauncher.statistics.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.tlauncher.statistics.service.RunCounterService;




@Controller
public class RunCounterController {
    @Autowired
    private RunCounterService service;


    @RequestMapping(value = "/save/run/tlauncher", method = RequestMethod.POST)
    public ResponseEntity<String> runCounter() {
        service.counter();
        return ResponseEntity.accepted().build();
    }

}
