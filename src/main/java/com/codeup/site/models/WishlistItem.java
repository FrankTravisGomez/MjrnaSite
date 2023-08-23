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
}
