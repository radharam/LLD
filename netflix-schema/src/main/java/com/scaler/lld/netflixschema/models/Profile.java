package com.scaler.lld.netflixschema.models;

import com.scaler.lld.netflixschema.models.enums.ProfileTypeEnum;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity(name = "profile")
public class Profile extends BaseModel{

    private String name;

    private ProfileTypeEnum profileType;

    @ManyToOne
    private NetflixUser netflixUser;

    @OneToMany(mappedBy = "profiles")
    private List<VideoProfile> videoProfile;
}
