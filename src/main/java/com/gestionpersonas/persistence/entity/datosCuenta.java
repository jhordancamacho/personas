package com.gestionpersonas.persistence.entity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity
@table(name="bill")
public class datosCuenta {

    @Id
    @Column(name="bill_id")
    private Integer billId;

    @Column(name="bill_number")
    private Integer billNumber;

    @Column(name="bill_amount")
    private Integer billAmount;

    @Column(name="user_id")
    private Integer userId;

}
