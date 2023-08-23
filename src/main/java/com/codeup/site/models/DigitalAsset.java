package com.codeup.site.models;

import jakarta.persistence.*;

import java.math.BigDecimal;
@Entity
@Table(name = "digital_assets")
public class DigitalAsset {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "asset_id")
    private int assetId;

    @Column(name = "asset_name", nullable = false)
    private String assetName;

    @Column(name = "description")
    private String description;

    @Column(name = "price", nullable = false)
    private BigDecimal price;

    @Column(name = "file_path", nullable = false)
    private String filePath;

    @Column(name = "download_link")
    private String downloadLink;

    @Column(name = "is_active", nullable = false)
    private boolean isActive = true;
}
