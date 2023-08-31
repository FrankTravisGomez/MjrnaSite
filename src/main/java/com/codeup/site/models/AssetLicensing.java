package com.codeup.site.models;

import jakarta.persistence.*;

@Entity
@Table(name = "asset_licensing")
@IdClass(AssetLicensingId.class) // Composite primary key
public class AssetLicensing {
    @Id
    @Column(name = "asset_id")
    private int assetId;

    @Id
    @Column(name = "option_id")
    private int optionId;

    @ManyToOne
    @JoinColumn(name = "asset_id", insertable = false, updatable = false)
    private DigitalAsset digitalAsset;


    public AssetLicensing(){

    }

    public AssetLicensing(int assetId, int optionId){
        this.assetId = assetId;
        this.optionId = optionId;
    }

    public int getAssetId(){
        return assetId;
    }

    public void setAssetId(int assetId) {
        this.assetId = assetId;
    }

    public int getOptionId(){
        return optionId;
    }

    public void setOptionId(int optionId) {
        this.optionId = optionId;
    }

    public DigitalAsset getDigitalAsset(){
        return digitalAsset;
    }

    public void setDigitalAsset(DigitalAsset digitalAsset) {
        this.digitalAsset = digitalAsset;
    }
}
