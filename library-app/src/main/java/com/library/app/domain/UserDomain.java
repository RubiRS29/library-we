package com.library.app.domain;


import com.library.app.persistence.entity.Rol;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class UserDomain {

    private Long idUser;

    private String firstName;

    private String lastName;

    private String userEmail;

    private String username;

    private String userPassword;

    private String userNationality;

    private String userPhoneNumber;

    private String userPhotoProfile;

    private Rol rolUser;

    private Date createAccount;

    private Date updateAccount;

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserNationality() {
        return userNationality;
    }

    public void setUserNationality(String userNationality) {
        this.userNationality = userNationality;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public String getUserPhotoProfile() {
        return userPhotoProfile;
    }

    public void setUserPhotoProfile(String userPhotoProfile) {
        this.userPhotoProfile = userPhotoProfile;
    }

    public Rol getRolUser() {
        return rolUser;
    }

    public void setRolUser(Rol rolUser) {
        this.rolUser = rolUser;
    }

    public Date getCreateAccount() {
        return createAccount;
    }

    public void setCreateAccount(Date createAccount) {
        this.createAccount = createAccount;
    }

    public Date getUpdateAccount() {
        return updateAccount;
    }

    public void setUpdateAccount(Date updateAccount) {
        this.updateAccount = updateAccount;
    }
}
