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

}
