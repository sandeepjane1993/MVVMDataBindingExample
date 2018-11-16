package com.example.sande.mvvmdatabindingexample.model;

public class UserPOJO {

    private String userName;
    private String userAge;

    public UserPOJO() {
    }

    public UserPOJO(String userName, String userAge) {
        this.userName = userName;
        this.userAge = userAge;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }
}
