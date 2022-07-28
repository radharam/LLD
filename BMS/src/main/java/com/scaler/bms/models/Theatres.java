package com.scaler.bms.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity(name = "theatre")
@Data
public class Theatres extends BaseModel{

    private String name;
    private String address;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "city")
    private List<Auditorium> audiList;
    //private List<String> upcomingShows;
    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;


}