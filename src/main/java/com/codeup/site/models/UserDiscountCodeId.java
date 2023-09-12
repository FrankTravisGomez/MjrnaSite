package com.codeup.site.models;

import java.io.Serializable;
import java.util.Objects;

public class UserDiscountCodeId implements Serializable {
    private int userId;
    private int codeId;

    public UserDiscountCodeId() {

    }

    public UserDiscountCodeId(int userId, int codeId) {
        this.userId = userId;
        this.codeId = codeId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCodeId() {
        return codeId;
    }

    public void setCodeId(int codeId) {
        this.codeId = codeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserDiscountCodeId)) return false;
        UserDiscountCodeId that = (UserDiscountCodeId) o;
        return getUserId() == that.getUserId() && getCodeId() == that.getCodeId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserId(), getCodeId());
    }

}
