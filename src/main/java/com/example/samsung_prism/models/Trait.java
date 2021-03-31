package com.example.samsung_prism.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "traits", schema = "samsung_prism")
public class Trait {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column
    private String state;

    @ManyToOne(optional = false)
    private Device device;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public String getState() {
        return state;
    }
}
