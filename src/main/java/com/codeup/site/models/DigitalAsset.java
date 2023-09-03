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

    public DigitalAsset() {

    }

    public DigitalAsset(
            String assetName,
            String description,
            BigDecimal price,
            String filePath,
            String downloadLink,
            boolean isActive
    ) {
        this.assetName = assetName;
        this.description = description;
        this.price = price;
        this.filePath = filePath;
        this.downloadLink = downloadLink;
        this.isActive = isActive;
    }

    public int getAssetId() {
        return assetId;
    }

    public void setAssetId(int assetId) {
        this.assetId = assetId;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getDownloadLink() {
        return downloadLink;
    }

    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
}
