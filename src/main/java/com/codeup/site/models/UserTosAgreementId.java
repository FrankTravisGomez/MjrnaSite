package com.codeup.site.models;

import java.io.Serializable;
import java.util.Objects;

public class UserTosAgreementId implements Serializable {
    private int userId;
    private int agreementId;

    public UserTosAgreementId() {

    }

    public UserTosAgreementId(int userId, int agreementId) {
        this.userId = userId;
        this.agreementId = agreementId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getAgreementId() {
        return agreementId;
    }

    public void setAgreementId(int agreementId) {
        this.agreementId = agreementId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserTosAgreementId)) return false;
        UserTosAgreementId that = (UserTosAgreementId) o;
        return getUserId() == that.getUserId() && getAgreementId() == that.getAgreementId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserId(), getAgreementId());
    }
}
