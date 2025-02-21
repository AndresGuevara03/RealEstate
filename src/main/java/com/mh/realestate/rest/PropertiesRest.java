package com.mh.realestate.rest;

import com.mh.realestate.models.Property;
import com.mh.realestate.services.PropertiesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/properties/")
public class PropertiesRest {

    @Autowired
    private PropertiesServices propertiesServices;

    @GetMapping
    private ResponseEntity<List<Property>> getAllProperties() {
        return ResponseEntity.ok(propertiesServices.findAll());
    }
}
