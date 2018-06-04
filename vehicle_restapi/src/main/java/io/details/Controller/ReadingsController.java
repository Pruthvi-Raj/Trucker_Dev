package io.details.Controller;


import io.details.Entity.Readings;
import io.details.Entity.Tires;
import io.details.Entity.Vehicle;
import io.details.service.ReadingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/readings")
public class ReadingsController {

    @Autowired
    ReadingsService readingsService;


    @CrossOrigin(origins = "http://mocker.egen.io")
    @RequestMapping(method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Readings create(@RequestBody Readings readings) {


        //tireSafe.setVin(readings.getVin());
        //tireSafe.setId(readings.getVin());

        return readingsService.create(readings);
    }
}
