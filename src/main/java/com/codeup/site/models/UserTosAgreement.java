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
}
