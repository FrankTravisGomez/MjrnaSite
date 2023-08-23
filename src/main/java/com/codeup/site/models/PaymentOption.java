package com.codeup.site.models;

import jakarta.persistence.*;

@Entity
@Table(name= "payment_options")
public class PaymentOption {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "option_id")
    private int optionId;

    @Column(name = "option_name", nullable = false)
    private String optionName;
}
