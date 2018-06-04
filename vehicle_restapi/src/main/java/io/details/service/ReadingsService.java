package io.details.service;

import io.details.Entity.Readings;
import io.details.Entity.Tires;
import io.details.Entity.Vehicle;
import io.details.Repository.ReadingsRepository;
import io.details.Repository.TiresRepository;
import io.details.exception.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
public class ReadingsService implements ReadingsServices {



    private final TiresRepository tiresRepository;
    private final ReadingsRepository readingsRepository;

    @Autowired
    ReadingsService(TiresRepository tiresRepository,
                    ReadingsRepository readingsRepository) {
        this.tiresRepository = tiresRepository;
        this.readingsRepository = readingsRepository;
    }


    @Override
    public List<Readings> findAll() {
        return null;
    }

    @Override
    public Readings findOne(String vin) {
        return null;
    }

    @Override
    public Readings create(Readings readings) {
        Optional<Readings> existing = readingsRepository.findById(readings.getVin());
        if (existing.isPresent()) {
            throw new BadRequestException("Readings with vin already exists.");
        }



        tiresRepository.save(readings.getTires());
        return readingsRepository.save(readings);
    }


    @Override
    public Tires create(Tires tireSafe) {

        System.out.println(" Checking " + tireSafe.getId());

        return tiresRepository.save(tireSafe);

        //tiresRepository.save(tireSafe);
    }

    @Override
    public List<Readings> update(List<Readings> readingsList) {
        return null;
    }

    @Override
    public void delete(String vin) {

    }
}
