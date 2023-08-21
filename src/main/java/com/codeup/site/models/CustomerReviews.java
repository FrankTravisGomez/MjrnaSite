package com.codeup.site.models;

import jakarta.persistence.*;

@Entity
@Table(name = "cust_review")
public class CustomerReviews {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "stars", nullable = false, length = 5)
    @Enumerated(EnumType.STRING)
    private Stars stars;

    @Column(name = "comment")
    private String comment;

    @ManyToOne
    @JoinColumn(name = "item_id", nullable = false)
    private Items item;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Users user;

    /*////////////////////////////////////////////////////////////////
    CONSTRUCTORS
    ////////////////////////////////////////////////////////////////*/

    public CustomerReviews() {}

    public CustomerReviews(Stars stars, String comment, Items item, Users user) {
        this.stars = stars;
        this.comment = comment;
        this.item = item;
        this.user = user;
    }

    public CustomerReviews(int id, Stars stars, String comment, Items item, Users user) {
        this.id = id;
        this.stars = stars;
        this.comment = comment;
        this.item = item;
        this.user = user;
    }

    /*////////////////////////////////////////////////////////////////
    GETTERS & SETTERS
    ////////////////////////////////////////////////////////////////*/

    public int getId() {return id;}
    public void setId(int id) {
        this.id = id;
    }

    public Stars getStars() {
        return stars;
    }
    public void setStars(Stars stars) {
        this.stars = stars;
    }

    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }

    public Items getTask() {
        return item;
    }
    public void setTask(Items task) {
        this.item = item;
    }

    public Users getUsers() {
        return user;
    }
    public void setUsers(Users user) {
        this.user = user;
    }
}
