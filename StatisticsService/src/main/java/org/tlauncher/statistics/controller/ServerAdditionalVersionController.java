package org.tlauncher.statistics.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.tlauncher.statistics.model.ServerAdditionalVersion;
import org.tlauncher.statistics.service.ServerAdditionalVersionService;

import java.sql.Timestamp;
import java.util.Date;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class ServerAdditionalVersionController {


    @Autowired
    private ServerAdditionalVersionService service;


    @RequestMapping(value = "/save/hot/server/additional", method = POST)
    public ResponseEntity<String> getAdditionalId(@RequestParam(value = "version") String additionalVersionId) {
        ServerAdditionalVersion serverAdditionalVersion = new ServerAdditionalVersion();
        serverAdditionalVersion.setAdditionalVersionId(additionalVersionId);
        serverAdditionalVersion.setDate(new Timestamp(new Date().getTime()));
        service.save(serverAdditionalVersion);
        return ResponseEntity.accepted().build();
    }
}
