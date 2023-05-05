package com.example.springproject.models.data;

import javax.persistence.*;



@Entity
@Table(name = "CAMPING_SPOTS")
public class CampingSpots {
    //camping spots- name, address, generate id
    @Id
    @Column(name = "CAMPING_SPOT_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "AVAILABLE_AREAS")
    public int availableAreas;

    @Column(name = "NAME")
    public String name;

    @Column(name = "ADDRESS")
    public String address;


    public CampingSpots(String name,String address,int availableAreas)
    {
        this.name = name;
        this.address = address;
        this.availableAreas = availableAreas;
    }
}
