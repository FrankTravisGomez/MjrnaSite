package com.codeup.site.models;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table
public class WishlistItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "wishlist_id")
    private int wishlistId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private DigitalAsset digitalAsset;

    @Column(name = "added_date", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TTIMESTAMP")
    private Timestamp addedDate;

    public WishlistItem() {

    }

    public WishlistItem(User user, DigitalAsset digitalAsset, Timestamp addedDate) {
        this.user = user;
        this.digitalAsset = digitalAsset;
        this.addedDate = addedDate;
    }

    public int getWishlistId() {
        return wishlistId;
    }

    public void setWishlistId(int wishlistId) {
        this.wishlistId = wishlistId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public DigitalAsset getDigitalAsset() {
        return digitalAsset;
    }

    public void setDigitalAsset(DigitalAsset digitalAsset) {
        this.digitalAsset = digitalAsset;
    }

    public Timestamp getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Timestamp addedDate) {
        this.addedDate = addedDate;
    }
}
