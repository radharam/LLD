package com.scaler.bms.models;

import com.scaler.bms.models.enums.AudiFeature;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@Entity(name = "auditorium")
@Data
public class Auditorium extends BaseModel{
    private String name;
    private int capacity;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Seat> seats;

    private AudiFeature audiFeature;



}
