package com.gestionpersonas.persistence.entity;


import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;

@Entity
@Table(name="transaction")
public class transaction {

    @Id
    @Column(name="transaction_id")
    private Integer transactionId;

    @Column(name="transaction_amount")
    private String transactionAmount;

    @Column(name="trasaction_type")
    private String transactionType;

    @Column(name="bill_id")
    private Integer billId;

    @Column(name="transaction_despcription")
    private String transactionDescription;

    @Column(name="transaction_date")
    private String transactionDate;

    @Column(name="transaction_estate")
    private Byte transactionEstate;
}
