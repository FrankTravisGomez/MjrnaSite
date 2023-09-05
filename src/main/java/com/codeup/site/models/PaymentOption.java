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

    public PaymentOption() {

    }

    public PaymentOption(String optionName) {
        this.optionName = optionName;
    }

    public int getOptionId() {
        return optionId;
    }

    public void setOptionId(int optionId) {
        this.optionId = optionId;
    }

    public String getOptionName() {
        return optionName;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }
}
