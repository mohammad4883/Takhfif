package com.maraton.mohammadmehdi.takhfif;

/**
 * Created by Mohammad Mehdi on 26/01/2018.
 */

public class signup {

    private String userName;
    private  String password;
    private  String email;

    public signup(String userName, String password,String email){
        this.userName = userName;
        this.password = password;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("My userName %s and Pasword is %s, email is %s ",getUserName(),getPassword(),getEmail());
    }
}
