package org.tlauncher.statistics.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.tlauncher.statistics.InstallVersionDTO;
import org.tlauncher.statistics.model.InstallVersion;
import org.tlauncher.statistics.service.InstallVersionService;

import java.sql.Timestamp;
import java.util.Date;


@Controller
public class InstallVersionController {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private InstallVersionService service;

    @RequestMapping(value = "/save/install/version", method = RequestMethod.POST)
    public ResponseEntity<String> installVersionSave(@RequestBody InstallVersionDTO dto) {
        InstallVersion version = modelMapper.map(dto, InstallVersion.class);
        version.setDate(new Timestamp(new Date().getTime()));
        service.save(version);
        return ResponseEntity.accepted().build();
    }
}
