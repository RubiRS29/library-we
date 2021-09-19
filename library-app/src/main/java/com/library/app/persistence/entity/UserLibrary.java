package com.library.app.persistence.entity;

import javax.persistence.*;
import java.util.Date;



@Entity
@Table(name="users")
public class UserLibrary {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column
        private Long id;
        @Column(length = 50)
        private String name;
        @Column(length = 50)
        private String lastName;
        @Column(unique = true, nullable = false)
        private String email;
        @Column(unique = true, nullable = false)
        private String username;
        @Column
        private String password;
        @Column
        private String nationality;
        @Column
        private String phone;

        @Column
        private String photoProfile;

        @Column
        @Enumerated(EnumType.STRING)
        private Rol rol;

        @Column
        private Date create;
        @Column
        private Date update;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getNationality() {
            return nationality;
        }

        public void setNationality(String nationality) {
            this.nationality = nationality;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public Rol getRol() {
            return rol;
        }

        public void setRol(Rol rol) {
            this.rol = rol;
        }

        public Date getCreate() {
            return create;
        }

        public void setCreate(Date create) {
            this.create = create;
        }

        public Date getUpdate() {
            return update;
        }

        public void setUpdate(Date update) {
            this.update = update;
        }

        public String getPhotoProfile() {
            return photoProfile;
        }

        public void setPhotoProfile(String photoProfile) {
            this.photoProfile = photoProfile;
        }


}
