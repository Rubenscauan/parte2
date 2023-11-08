package com.projeto.models;

import java.util.Date;

public class Champion {
    int id;
    String name;
    String position;
    String range;
    String region;
    String resource;
    Date creationDate;


    public Champion(int id, String name, String position, String range, String region, String resource) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.range = range;
        this.region = region;
        this.resource = resource;
    
    }
    
    public Champion(){}

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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
    

    

}
