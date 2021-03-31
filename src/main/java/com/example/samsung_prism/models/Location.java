package com.example.samsung_prism.models;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "locations", schema = "samsung_prism")
public class Location {
    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true, nullable = false)
    private String label;

    @Column
    private String address;

    @Column(precision = 3)
    private float longitude;

    @Column(precision = 3)
    private float latitude;

    @OneToMany(mappedBy = "location")
    private List<Room> rooms;

    @ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @JoinTable(name = "user_devices", joinColumns = { @JoinColumn(name = "location_id") }, inverseJoinColumns = {
            @JoinColumn(name = "user_id") })
    private Set<User> locations = new HashSet<>();

    public void setAddress(String address) {
        this.address = address;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public String getLabel() {
        return label;
    }

    public float getLatitude() {
        return latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public Long getId() {
        return id;
    }
}
