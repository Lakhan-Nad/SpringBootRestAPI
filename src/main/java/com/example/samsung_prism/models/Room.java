package com.example.samsung_prism.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rooms", schema = "samsung_prism")
public class Room {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String label;

    @ManyToOne(optional = false)
    private Location location;

    public void setLabel(String label) {
        this.label = label;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public Long getId() {
        return id;
    }
}
