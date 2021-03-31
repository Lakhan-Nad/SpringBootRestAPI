package com.example.samsung_prism.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "rooms", schema = "samsung_prism")
public class Room {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String label;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Location location;

    @OneToMany(mappedBy = "room")
    private List<Device> devices;

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
