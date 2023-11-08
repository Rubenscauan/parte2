package com.projeto.models;

import java.util.ArrayList;

public class User {
    int id;
    String name;
    String password;
    ArrayList<Match> historic;
    
    public User(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Match> getHistoric() {
        return historic;
    }

    public void setHistoric(ArrayList<Match> historic) {
        this.historic = historic;
    }

    

}
