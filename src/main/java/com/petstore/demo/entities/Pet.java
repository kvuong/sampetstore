package com.petstore.demo.entities;

public class Pet {
    
    private String name;
    private String type;
    private String owner;


    public Pet(String petType, String petName, String petOwner){
        this.type = petType;
        this.name = petName;
        this.owner = petOwner;

    }

    public String getPetName() {
        return name;
        
    }
    public String getPetType() {
        return type;

    }
    public String getPetOwner() {
        return owner;
    }
}
