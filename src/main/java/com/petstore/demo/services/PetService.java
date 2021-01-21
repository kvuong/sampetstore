package com.petstore.demo.services;

import java.util.List;
import java.util.Optional;

import com.petstore.demo.entities.Pet;

public class PetService {

    private List<Pet> pets;

    public PetService(List<Pet> pets) {
        this.pets = pets;
    }

    public Pet createPet(String type, String name) {
        return new Pet(type, name);
    }

    public Optional<Pet> findPetByName(String name) {
        return pets.stream().filter(p -> p.getName().equals(name)).findFirst();
    }
}
