package com.bc.wechat.server.entity;

import com.bc.wechat.server.utils.CommonUtil;

import java.io.Serializable;

/**
 * 用户
 *
 * @author zhou
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    private String userId;
    private String userNickName;
    private String userPhone;
    private String userPassword;
    private String userAvatar;
    private String userHeader;
    private String userSex;

    public User() {

    }

    public User(String userNickName, String userPhone, String userPassword) {
        this.userId = CommonUtil.generateId();
        this.userNickName = userNickName;
        this.userPhone = userPhone;
        this.userPassword = userPassword;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }

    public String getUserHeader() {
        return userHeader;
    }

    public void setUserHeader(String userHeader) {
        this.userHeader = userHeader;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }
}
