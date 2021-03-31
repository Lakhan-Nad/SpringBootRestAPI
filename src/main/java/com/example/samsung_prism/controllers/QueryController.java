package com.example.samsung_prism.controllers;

import java.util.ArrayList;
import java.util.List;

import com.example.samsung_prism.Faker;
import com.example.samsung_prism.Query;
import com.example.samsung_prism.models.Device;
import com.example.samsung_prism.models.Trait;
import com.example.samsung_prism.repository.DeviceRepository;
import com.example.samsung_prism.repository.LocationRepository;
import com.example.samsung_prism.repository.RoomRepository;
import com.example.samsung_prism.repository.TraitRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/query")
public class QueryController {

    @Autowired
    RoomRepository roomRepository;

    @Autowired
    DeviceRepository deviceRepository;

    @Autowired
    TraitRepository traitRepository;

    @Autowired
    LocationRepository locationRepository;

    @Autowired
    Faker faker;

    @GetMapping
    public ResponseEntity<HttpStatus> fillFakeData() {
        try {
            faker.fillFakeData();
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<List<Trait>> stateInfo(@RequestBody Query query) {
        try {
            List<Device> devicesInRoom = deviceRepository.findByRoomLabel(query.getRoom());
            List<Trait> result = new ArrayList<>();
            devicesInRoom.stream()
                    .filter(device -> device.getLabel().toLowerCase().equals(query.getDevice().toLowerCase()))
                    .forEach(device -> {
                        List<Trait> traits = traitRepository.findByDeviceId(device.getId());
                        device.setTraits(traits);
                        traits.stream()
                                .filter(trait -> trait.getName().toLowerCase().equals(query.getAction().toLowerCase()))
                                .forEach(trait -> {
                                    trait.setState(query.getState());
                                    traitRepository.save(trait);
                                    result.add(trait);
                                });
                    });
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}