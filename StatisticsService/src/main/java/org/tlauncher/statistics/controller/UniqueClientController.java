package org.tlauncher.statistics.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.tlauncher.statistics.UniqueClientDTO;
import org.tlauncher.statistics.model.UniqueClient;
import org.tlauncher.statistics.service.UniqueClientService;

import java.sql.Timestamp;
import java.util.Date;

@Controller
public class UniqueClientController {
    @Autowired
    private ModelMapper modelMapper;


    @Autowired
    private UniqueClientService service;

    @RequestMapping(value = "/save/run/tlauncher/unique", method = RequestMethod.POST)
    public ResponseEntity<String> uniqueClientSave(@RequestBody UniqueClientDTO dto) {
        UniqueClient uniqueClient = modelMapper.map(dto, UniqueClient.class);
        uniqueClient.setDate(new Timestamp(new Date().getTime()));
        service.save(uniqueClient);
        return ResponseEntity.accepted().build();
    }
}
