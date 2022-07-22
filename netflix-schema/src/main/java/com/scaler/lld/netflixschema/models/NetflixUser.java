package com.scaler.lld.netflixschema.models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity(name = "netflixUser")
public class NetflixUser extends BaseModel{

    private String email;

    private String password;

    @OneToMany(mappedBy = "netflixUser")
    private List<Profile> userProfiles;
}
