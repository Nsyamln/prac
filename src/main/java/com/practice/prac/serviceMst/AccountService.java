package com.practice.prac.serviceMst;

import com.practice.prac.tosys.UserTO;

public interface AccountService {
    public UserTO getAccount(String vendor);

    public String addAccount(UserTO tobpUser);
}
