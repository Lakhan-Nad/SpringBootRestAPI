package com.example.samsung_prism.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.example.samsung_prism.models.Trait;

@Repository
public interface TraitRepository extends JpaRepository<Trait, Long> {
    List<Trait> findByDeviceId(Long id);

    List<Trait> findByDeviceLabel(String label);
}
