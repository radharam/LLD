package com.scaler.bms.models;

import com.scaler.bms.models.enums.MovieFeatureEnum;

import java.util.List;

public class Movie extends BaseModel{
    private String name;
    private String language;
    private List<Actor> cast;
    private int rating;
    private double duration;
    private MovieFeatureEnum movieFeature;
}
