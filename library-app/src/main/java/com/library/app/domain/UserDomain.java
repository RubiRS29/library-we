package com.library.app.domain;


import com.library.app.persistence.entity.Rol;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class UserDomain {

    @Getter @Setter
    private Long idUser;
    @Getter @Setter
    private String firstName;
    @Getter @Setter
    private String lastName;
    @Getter @Setter
    private String userEmail;
    @Getter @Setter
    private String username;
    @Getter @Setter
    private String userPassword;
    @Getter @Setter
    private String userNationality;
    @Getter @Setter
    private String userPhoneNumber;
    @Getter @Setter
    private String userPhotoProfile;
    @Getter @Setter
    private Rol rolUser;
    @Getter @Setter
    private Date createAccount;
    @Getter @Setter
    private Date updateAccount;

}
