package com.bjsxt.pojo;

import java.io.Serializable;

public class User implements Serializable {
    private Integer uid;
    private String uname;

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                '}';
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public User() {
    }

    public User(Integer uid, String uname) {
        this.uid = uid;
        this.uname = uname;
    }
}
