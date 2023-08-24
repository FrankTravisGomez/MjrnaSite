package com.codeup.site.models;
import jakarta.persistence.*;

@Entity
@Table(name = "user_discount_codes")
@IdClass(UserDiscountCodeId.class) // Composite primary key
public class UserDiscountCode {
    @Id
    @Column(name = "user_id")
    private int userId;

    @Id
    @Column(name = "code_id")
    private int codeId;

    @ManyToOne
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "code_id", insertable = false, updatable = false)
    private DiscountCode discountCode;
}
