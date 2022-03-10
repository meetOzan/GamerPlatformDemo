package com.meetOzan.Entities;

public class Gamers {

    private int id;
    private String firstName;
    private String lastName;
    public String nickname;
    private String nationalId;
    private String dateOfBirth;
    public String newNickName;

    public Gamers() {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalId = nationalId;
        this.dateOfBirth = dateOfBirth;
        this.nickname = nickname;
        this.newNickName = newNickName;
    }






    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNewNickName() {
        return newNickName;
    }

    public void setNewNickName(String newNickName) {
        this.newNickName = newNickName;
    }

}
