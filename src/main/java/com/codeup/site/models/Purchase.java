package com.codeup.site.models;
import jakarta.persistence.*;
import java.sql.Timestamp;
@Entity
@Table(name = "purchases")
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "purchase_id")
    private int purchaseId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "asset_id", nullable = false)
    private DigitalAsset digitalAsset;

    @Column(name = "purchase_date", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp purchaseDate;

    @Column(name = "purchase_status", nullable = false)
    private String purchaseStatus = "pending";

    public Purchase() {

    }

    public Purchase(User user, DigitalAsset digitalAsset) {
        this.user = user;
        this.digitalAsset = digitalAsset;
    }

    public int getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(int purchaseId) {
        this.purchaseId = purchaseId;
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

    public Timestamp getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Timestamp purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getPurchaseStatus() {
        return purchaseStatus;
    }

    public void setPurchaseStatus(String purchaseStatus) {
        this.purchaseStatus = purchaseStatus;
    }
}
