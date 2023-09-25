package com.practice.prac.tosys;

import java.io.Serializable;

import com.practice.prac.tomst.VendorTO;

public class UserTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer UserID;
    private String username;
    private String password;
    private String passwordConfirm;
    private String UserFullName;
    private String UserEmail;
    private UserTypeTO tobUserType;
    private VendorTO tobVendor;
    private String current_login;
    private String last_login;
    private String ip_address;
    private String browser;
    private String operating_system;

}
