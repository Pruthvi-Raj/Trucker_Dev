package io.details.service;

import io.details.Entity.Readings;
import io.details.Entity.Tires;
import io.details.Entity.Vehicle;

import java.util.List;

public interface ReadingsServices {

    List<Readings> findAll();

    Readings findOne(String vin);

    Readings create(Readings readings);

    Tires create(Tires tireSafe);


    List<Readings> update(List<Readings> readingsList);

    void delete(String vin);
}
