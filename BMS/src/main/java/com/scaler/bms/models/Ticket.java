package com.scaler.bms.models;

import com.scaler.bms.models.enums.TicketStatus;

import java.util.List;

public class Ticket extends BaseModel{
    private double amount;
    private Show show;
    //private boolean userBooked;
    private Payment payment;
    private List<Seat> seats;
    private TicketStatus ticketStatus;
}
