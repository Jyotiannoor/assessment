package com.trigyn.instrumentService.controller;

import com.trigyn.instrumentService.model.Instrument;
import com.trigyn.instrumentService.service.InstrumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InstrumentController {

    @Autowired
    private InstrumentService instrumentService;

    @PostMapping("/instrument")
    public boolean addInstruments(@RequestBody Instrument instrument){
        return instrumentService.addInstrument(instrument);
    }

    @GetMapping("/instrument")
    public List<Instrument> getInstruments(){
        return instrumentService.getInstrument();
    }
}
