package com.petstore.demo.entities;

import java.util.ArrayList;
import java.util.List;

public class Owner {

    private String name;
    private List<Pet> pets;

    public Owner(String ownerName) {
        this.name = ownerName;
        this.pets = new ArrayList();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    public void addPet(Pet pet) {
        pets.add(pet);
    }
}
