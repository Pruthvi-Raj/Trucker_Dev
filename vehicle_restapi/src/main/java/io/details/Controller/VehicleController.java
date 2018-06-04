package io.details.Controller;


import io.details.Entity.Vehicle;
import io.details.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicles")

public class VehicleController {

    @Autowired
    VehicleService vehicleService;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Vehicle> findAll() {

        return vehicleService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Vehicle create(@RequestBody Vehicle vehicle) {

        return vehicleService.create(vehicle);
    }


    @CrossOrigin(origins = "http://mocker.egen.io")
    @RequestMapping(method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Vehicle> update(@RequestBody List<Vehicle> vehicles) {
        List<Vehicle> vehicleList = vehicleService.update(vehicles);
        if(vehicleList.isEmpty()){
            return null;
        }
        return vehicleList;
    }

}
