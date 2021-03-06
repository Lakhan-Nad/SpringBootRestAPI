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
@Table(name = "devices", schema = "samsung_prism")
public class Device {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String label;

    @Column
    private String type;

    @Column
    private String model;

    @Column
    private String brandName;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    @JsonIgnore
    @OneToMany(mappedBy = "device")
    private List<Trait> traits;

    public void setLabel(String label) {
        this.label = label;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public String getLabel() {
        return label;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public Long getId() {
        return id;
    }

    public Room getRoom() {
        return room;
    }

    public List<Trait> getTraits() {
        return traits;
    }

    public void setTraits(List<Trait> traits) {
        this.traits = traits;
    }

    public Device(String label, String type, String model, String brandName) {
        super();

        this.type = type;
        this.brandName = brandName;
        this.label = label;
        this.model = model;
    }

    public Device() {
        super();
    }
}
