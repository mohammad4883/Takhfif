package com.maraton.mohammadmehdi.takhfif;

/**
 * Created by Mohammad Mehdi on 26/01/2018.
 */

public class Login {

    private String userName;
    private  String password;

    //Create Cunstractor
    public Login(String userName,String Password){

        this.userName = userName;
        this.password = Password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return String.format("Name is %s And Family %s",getUserName(),getPassword());
    }
}
