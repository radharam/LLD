package com.scaler.bms.models;

import com.scaler.bms.models.enums.SeatTypeEnum;
import com.scaler.bms.models.enums.ShowFeature;

import java.util.Date;
import java.util.List;

public class Show extends BaseModel{
    private Date startTime;
    private Date endTime;
    private Auditorium audi;
    private ShowFeature showFeature;
    private String language;
    private List<ShowSeat> showSeat;
    private SeatTypeEnum seatTypeEnum;
}
