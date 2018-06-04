package io.details.service;


import io.details.Entity.Vehicle;
import io.details.Repository.VehicleRepository;
import io.details.exception.BadRequestException;
import io.details.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleService implements VehicleServices{


    @Autowired
    VehicleRepository vehicleRepository;

    @Transactional
    public List<Vehicle> findAll() {
        return (List<Vehicle>) vehicleRepository.findAll();
    }

    @Transactional
    public Vehicle findOne(String vin) {
        return null;
    }

    @Override
    public Vehicle create(Vehicle vehicle) {
        return null;
    }


    String message = "Successfully updated";
    @Transactional
    public List<Vehicle> update(List<Vehicle> vehicles) {
        try {
            for (Vehicle vehicle: vehicles){
                Optional<Vehicle> existing = vehicleRepository.findById(vehicle.getVin());
                vehicleRepository.save(vehicle);
            }

        }catch (Exception ex){
            throw new BadRequestException("Vehicles not updated");
        }
        return vehicles;
    }

//    @Transactional
//    public List<Vehicle> update(Vehicle vehicles) {
//        Optional<Vehicle> existing = vehicleRepository.findById();
//        if (!existing.isPresent()) {
//            throw new ResourceNotFoundException("Employee with id " + id + " doesn't exist.");
//        }
//        return repository.save(emp);
//
//
//        return null;
//    }

    @Transactional
    public void delete(String vin) {

    }


}
