package com.mjc813.swimpool_app.swimLogin.dto;

import com.mjc813.swimpool_app.common.IIdName;

public interface ISign extends IIdName{
    String getUsername();
    void setUsername(String username);

    String getPassword();
    void setPassword(String password);

    String getEmail();
    void setEmail(String email);

    String getPhoneNumber();
    void setPhoneNumber(String phoneNumber);

    String getRole();
    void setRole(String role);

    Integer getMaxLock();
    void setMaxLock(Integer maxLock);

    default void copyMembers(ISign iSign) {
        if ( iSign == null ) {
            return;
        }
        this.copyMembersIdName(iSign);
        this.setUsername(iSign.getUsername());
        this.setPassword(iSign.getPassword());
        this.setEmail(iSign.getEmail());
        this.setPhoneNumber(iSign.getPhoneNumber());
        this.setRole(iSign.getRole());
        this.setMaxLock(iSign.getMaxLock());
    }
}
