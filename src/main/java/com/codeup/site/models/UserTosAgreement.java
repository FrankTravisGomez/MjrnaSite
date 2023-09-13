package com.codeup.site.models;

import jakarta.persistence.*;

@Entity
@Table(name = "user_tos_agreements")
@IdClass(UserTosAgreementId.class)
public class UserTosAgreement {
    @Id
    @Column(name = "user_id")
    private int userId;

    @Id
    @Column(name = "agreement_id")
    private int agreementId;

    @ManyToOne
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "agreement_id", insertable = false, updatable = false)
    private TosAgreement tosAgreement;

    public UserTosAgreement() {

    }

    public UserTosAgreement(int userId, int agreementId) {
        this.userId = userId;
        this.agreementId = agreementId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getAgreementId() {
        return agreementId;
    }

    public void setAgreementId(int agreementId) {
        this.agreementId = agreementId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public TosAgreement getTosAgreement() {
        return tosAgreement;
    }

    public void setTosAgreement(TosAgreement tosAgreement) {
        this.tosAgreement = tosAgreement;
    }
}
