package com.gestionpersonas.persistence.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@Entity
@Table(name="code_transaction")
public class codeTransaction {

    @Id
    @Column(name="code_id")
    private Integer codeId;

    private String code;

    @Column(name="number_bill")
    private String numberBill;

    @Column(name="code_time")
    private String codeTime;
}
