package com.scaler.bms.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@Entity(name = "city")
@Data
public class City extends BaseModel{

    private String name;
    private String zipcode;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "city")
    private List<Theatres> theatres = new java.util.ArrayList<>();


}
