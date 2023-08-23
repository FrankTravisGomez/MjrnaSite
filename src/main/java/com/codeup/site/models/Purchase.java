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
}
