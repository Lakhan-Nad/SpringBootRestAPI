package com.example.samsung_prism.services;

import com.example.samsung_prism.repository.DeviceRepository;
import com.example.samsung_prism.repository.RoomRepository;
import com.example.samsung_prism.repository.TraitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeviceService {

    @Autowired
    private DeviceRepository deviceRepository;

    @Autowired
    private RoomRepository roomRepository;

    @Autowired
    private TraitRepository traitRepository;
}
