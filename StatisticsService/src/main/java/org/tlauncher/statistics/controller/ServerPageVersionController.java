package org.tlauncher.statistics.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.tlauncher.statistics.service.ServerPageVersionService;

@Controller
public class ServerPageVersionController {


    @Autowired
    private ServerPageVersionService service;


    @RequestMapping(value = "/save/hot/server/main/page", method = RequestMethod.POST)
    public ResponseEntity<String> getId(@RequestParam(value = "version") String pageVersionId) {
        service.savePageVersionId(pageVersionId);
        return ResponseEntity.accepted().build();
    }
}
