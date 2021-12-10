package com.gestionpersonas.persistence.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name="user")
public class user {

    @Id
    @Column(name="user_id")
    private Integer userId;

    @Column(name="user_id")
    private String userPassword;

    @Column(name="user_email")
    private String userEmail;

    @Column(name="user_estate")
    private String userEstate;

    @Column(name="user_identification")
    private String userIdentification;

    @Column(name="user_name")
    private String userName;

}
