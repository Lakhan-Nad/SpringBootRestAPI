package com.example.samsung_prism.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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

    @ManyToOne(optional = false)
    private Room room;

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
}
