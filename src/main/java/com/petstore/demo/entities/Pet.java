package com.petstore.demo.entities;

public class Pet {

    private String name;
    private String type;
    private String Owner;

    public Pet(String petType, String petName) {
        this.type = petType;
        this.name = petName;
    }

    public String getPetName() {
        return name;
    }

    public void setPetName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String owner) {
        Owner = owner;
    }
}