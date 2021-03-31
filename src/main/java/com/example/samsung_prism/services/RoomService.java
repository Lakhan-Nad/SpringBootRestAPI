package com.example.samsung_prism.services;

import com.example.samsung_prism.repository.LocationRepository;
import com.example.samsung_prism.repository.RoomRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomService {

    @Autowired
    private LocationRepository locationRepository;

    @Autowired
    private RoomRepository roomRepository;

}
