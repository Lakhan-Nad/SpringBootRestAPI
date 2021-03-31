package com.example.samsung_prism.services;

import com.example.samsung_prism.repository.DeviceRepository;
import com.example.samsung_prism.repository.TraitRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TraitService {

    @Autowired
    private TraitRepository traitRepository;

    @Autowired
    private DeviceRepository deviceRepository;
}
