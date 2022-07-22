package com.scaler.lld.netflixschema.models;

import com.scaler.lld.netflixschema.models.BaseModel;
import com.scaler.lld.netflixschema.models.enums.VideoProfileStatusEnum;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity(name = "video_profile")
public class VideoProfile extends BaseModel {

    private VideoProfileStatusEnum videoStatus;

    private Date lastPausedAt;

    @ManyToOne
    private Video videos;

    @ManyToOne
    private Profile profiles;
}
