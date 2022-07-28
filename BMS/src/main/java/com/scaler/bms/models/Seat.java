package com.scaler.bms.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "seat")
@Data
public class Seat extends BaseModel{
    private int seatNumber;

    @ManyToOne
    private SeatType seatType;
}
