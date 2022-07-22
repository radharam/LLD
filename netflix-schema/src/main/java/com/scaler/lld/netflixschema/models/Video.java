package com.scaler.lld.netflixschema.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.List;

@Entity(name = "video")
public class Video extends BaseModel{
    private String title;
    private String description;

    @ManyToMany(mappedBy = "videos")
    private List<Actor> cast;

    @OneToMany(mappedBy = "videos")
    private List<VideoProfile> videoProfiles;
}
