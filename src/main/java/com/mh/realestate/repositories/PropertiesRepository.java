package com.mh.realestate.repositories;

import com.mh.realestate.models.Property;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertiesRepository extends JpaRepository<Property, Long> {

}
