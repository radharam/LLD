package com.scaler.lld.netflixschema.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity(name = "actor")
public class Actor extends BaseModel{
    private String name;

    @ManyToMany
    private List<Video> videos;


}
