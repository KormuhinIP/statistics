package org.tlauncher.statistics.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.tlauncher.statistics.UpdaterDTO;
import org.tlauncher.statistics.model.Updater;
import org.tlauncher.statistics.service.UpdaterService;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.util.Date;


@Controller
public class UpdaterController {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private UpdaterService service;

    @RequestMapping(value = "/updater/save", method = RequestMethod.POST)
    public ResponseEntity<String> updaterSave(@RequestBody UpdaterDTO dto, HttpServletRequest request) {
        Updater updater = modelMapper.map(dto, Updater.class);
        updater.setDate(new Timestamp(new Date().getTime()));
        service.save(updater, request);
        return ResponseEntity.accepted().build();
    }
}
