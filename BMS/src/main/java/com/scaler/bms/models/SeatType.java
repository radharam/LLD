package com.scaler.bms.models;

import com.scaler.bms.models.enums.SeatTypeEnum;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "seat_type")
public class SeatType extends BaseModel{

    private SeatTypeEnum seatTypeEnum;
    private double price;
}