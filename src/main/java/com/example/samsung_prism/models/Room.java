package com.example.samsung_prism.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "rooms", schema = "samsung_prism")
public class Room {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String label;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

    @JsonIgnore
    @OneToMany(mappedBy = "room")
    private List<Device> devices;

    public void setLabel(String label) {
        this.label = label;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getLabel() {
        return label;
    }

    public Long getId() {
        return id;
    }

    public Location getLocation() {
        return location;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }

    public Room(String label) {
        super();

        this.label = label;
    }

    public Room() {
        super();
    }
}
