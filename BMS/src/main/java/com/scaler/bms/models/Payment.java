package com.scaler.bms.models;

import com.scaler.bms.models.enums.PaymentMethod;
import org.springframework.boot.orm.jpa.hibernate.SpringImplicitNamingStrategy;

import java.util.Date;

public class Payment extends BaseModel{
    private int referenceId;
    private PaymentMethod paymentMethod;
    private Date time;
    private double amount;
}
