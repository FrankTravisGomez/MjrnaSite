package com.codeup.site.models;
import jakarta.persistence.*;
@Entity
@Table(name = "asset_categories")
@IdClass(AssetCategoryId.class) // Composite primary key
public class AssetCategory {
    @Id
    @Column(name = "asset_id")
    private int assetId;

    @Id
    @Column(name = "category_id")
    private int categoryId;

    @ManyToOne
    @JoinColumn(name = "asset_id", insertable = false, updatable = false)
    private DigitalAsset digitalAsset;

    @ManyToOne
    @JoinColumn(name = "category_id", insertable = false, updatable = false)
    private Categories category;

    public AssetCategory() {

    }

    public AssetCategory(int assetId, int categoryId) {
        this.assetId = assetId;
        this.categoryId = categoryId;
    }

    //getters and setters
    public int getAssetId() {
        return assetId;
    }

    public void setAssetId(int assetId) {
        this.assetId = assetId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public DigitalAsset getDigitalAsset() {
        return digitalAsset;
    }

    public void setDigitalAsset(DigitalAsset digitalAsset) {
        this.digitalAsset = digitalAsset;
    }

    public Categories getCategory() {
        return category;
    }

    public void setCategory(Categories category) {
        this.category = category;
    }

}
