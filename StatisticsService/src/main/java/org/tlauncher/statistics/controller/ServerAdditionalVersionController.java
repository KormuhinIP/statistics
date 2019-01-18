package org.tlauncher.statistics.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.tlauncher.statistics.service.ServerAdditionalVersionService;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class ServerAdditionalVersionController {


    @Autowired
    private ServerAdditionalVersionService service;


    @RequestMapping(value = "/save/hot/server/additional", method = POST)
    public ResponseEntity<String> getAdditionalId(@RequestParam(value = "version") String additionalVersionId) {
        service.saveAdditionalVersionId(additionalVersionId);
        return ResponseEntity.accepted().build();
    }
}
