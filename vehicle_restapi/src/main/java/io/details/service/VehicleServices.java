package io.details.service;

import io.details.Entity.Vehicle;

import java.util.List;

public interface VehicleServices {

    List<Vehicle> findAll();

    Vehicle findOne(String vin);

    Vehicle create(Vehicle vehicle);

    String update(List<Vehicle> vehicles);

    void delete(String vin);
}
