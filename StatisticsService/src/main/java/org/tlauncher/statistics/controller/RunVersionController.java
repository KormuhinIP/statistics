package org.tlauncher.statistics.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.tlauncher.statistics.service.RunVersionService;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class RunVersionController {


    @Autowired
    private RunVersionService service;


    @RequestMapping(value = "/save/run/version", method = POST)
    public ResponseEntity<String> getVersion(@RequestParam(value = "version") String version) {
        service.saveVersion(version);
        return ResponseEntity.accepted().build();
    }
}
