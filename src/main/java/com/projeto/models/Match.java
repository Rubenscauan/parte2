package com.projeto.models;

import java.util.ArrayList;

public class Match {
    int id;
    ArrayList<User> players;

    public Match(int id) {
        this.id = id;
    }

    public Match(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<User> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<User> players) {
        this.players = players;
    }
    
    
}
