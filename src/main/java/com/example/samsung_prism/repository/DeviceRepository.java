package com.example.samsung_prism.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.samsung_prism.models.Device;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Long> {

}
