package com.example.samsung_prism.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.samsung_prism.models.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {
}
