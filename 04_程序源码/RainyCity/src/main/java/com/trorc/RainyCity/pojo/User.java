package com.trorc.RainyCity.pojo;

public class User {
    private String c_id;
    private String c_name;
    private int n_age;

    public String getC_id() {
        return c_id;
    }

    public void setC_id(String c_id) {
        this.c_id = c_id;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public int getN_age() {
        return n_age;
    }

    public void setN_age(int n_age) {
        this.n_age = n_age;
    }

    @Override
    public String toString() {
        return "User{" +
                "c_id='" + c_id + '\'' +
                ", c_name='" + c_name + '\'' +
                ", n_age=" + n_age +
                '}';
    }
}
