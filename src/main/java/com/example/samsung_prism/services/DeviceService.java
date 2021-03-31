package com.example.samsung_prism.services;

import com.example.samsung_prism.models.Device;
import com.example.samsung_prism.repository.DeviceRepository;
import com.example.samsung_prism.repository.RoomRepository;
import com.example.samsung_prism.repository.TraitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeviceService {

    @Autowired
    private DeviceRepository deviceRepository;

    @Autowired
    private RoomRepository roomRepository;

    @Autowired
    private TraitRepository traitRepository;

    public Device addNewDevice(String label, String model, String brandName, String type) {
        Device device = new Device();
        device.setBrandName(brandName);
        device.setLabel(label);
        device.setModel(model);
        device.setType(type);

        // save one
        deviceRepository.save(device);

        // returned save device
        return device;
    }

    public List<Device> getAll() {
        return deviceRepository.findAll();
    }

    public Device updateById(Long id, Device device) {
        Optional<Device> savedDevice = deviceRepository.findById(id);

        if (savedDevice.isPresent()) {
            device.setId(id);
            deviceRepository.save(device);
            return device;
        }

        return null;
    }

    public Device getById(Long id) {
        Optional<Device> savedDevice = deviceRepository.findById(id);
        if (savedDevice.isPresent()) {
            return savedDevice.get();
        }
        return null;
    }

    public Device deleteById(Long id) {
        deviceRepository.deleteById(id);
        return null;
    }
}
