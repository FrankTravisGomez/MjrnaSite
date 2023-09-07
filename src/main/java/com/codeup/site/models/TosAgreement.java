package com.codeup.site.models;

import jakarta.persistence.*;

@Entity
@Table(name = "tos_agreements")
public class TosAgreement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "agreement_id")
    private int agreementId;

    @Column(name = "agreement_text", nullable = false)
    private String agreementText;

    public TosAgreement() {

    }

    public TosAgreement(String agreementText) {
        this.agreementText = agreementText;
    }

    public int getAgreementId() {
        return agreementId;
    }

    public void setAgreementId(int agreementId) {
        this.agreementId = agreementId;
    }

    public String getAgreementText() {
        return agreementText;
    }

    public void setAgreementText(String agreementText) {
        this.agreementText = agreementText;
    }
}
