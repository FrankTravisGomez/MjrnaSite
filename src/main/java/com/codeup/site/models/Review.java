package com.codeup.site.models;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "reviews")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_id")
    private int reviewId;

    @ManyToOne
    @JoinColumn(name = "iser_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "asset_id", nullable = false)
    private DigitalAsset digitalAsset;

    @Column(name = "rating", nullable = false)
    private int rating;

    @Column(name = "comment")
    private String comment;

    @Column(name = "review_date", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp reviewDate;

    public Review() {

    }

    public Review(User user, DigitalAsset digitalAsset, int rating, String comment) {
        this.user = user;
        this.digitalAsset = digitalAsset;
        this.rating = rating;
        this.comment = comment;
    }

    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
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

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Timestamp getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(Timestamp reviewDate) {
        this.reviewDate = reviewDate;
    }
}
