package com.gestionpersonas.persistence.entity;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Table;

import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@Entity
@Table(name="bill")
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

    @OneToMany(mappedBy = "datoscuenta")
    private List<transaction> transactions;

}
