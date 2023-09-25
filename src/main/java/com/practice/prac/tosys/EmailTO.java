package com.practice.prac.tosys;

import java.io.Serializable;

public class EmailTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String SenderHost;
    private String SenderPort;
    private String SenderEmail;
    private String SenderPassword;
    private String SenderUser;
}
