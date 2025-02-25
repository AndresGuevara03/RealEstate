package com.mh.realestate.rest;

import com.mh.realestate.models.Property;
import com.mh.realestate.services.PropertiesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
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
    @GetMapping("/{id}")
    private ResponseEntity<Property> getPropertyById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(propertiesServices.findById(id).get());
    }

    @PostMapping
    private ResponseEntity<Property> createProperty(@RequestBody Property property) {
        Property savedProperty = propertiesServices.save(property);
        try {
            return ResponseEntity.created(new URI("/properties/" + savedProperty.getId())).body(savedProperty);
        } catch (URISyntaxException e) {
            return ResponseEntity.badRequest().build();
        }
    }
}
