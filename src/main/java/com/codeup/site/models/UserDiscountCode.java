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

    public UserDiscountCode() {

    }

    public UserDiscountCode(int userId, int codeId) {
        this.userId = userId;
        this.codeId = codeId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCodeId() {
        return codeId;
    }

    public void setCodeId(int codeId) {
        this.codeId = codeId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public DiscountCode getDiscountCode() {
        return discountCode;
    }

    public void setDiscountCode(DiscountCode discountCode) {
        this.discountCode = discountCode;
    }
}
