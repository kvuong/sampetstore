package com.petstore.demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.petstore.demo.entities.Pet;
import com.petstore.demo.services.PetService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PetServiceTest {

    private List<Pet> pets;

    @BeforeEach
    public void initTest() {
        pets = new ArrayList();
    
        Pet cat = new Pet("Cat", "Silvester");
        Pet dog = new Pet("Dog", "Barney");
        Pet fish = new Pet("Fish", "Nemo");
        pets.add(cat);
        pets.add(dog);
        pets.add(fish);
    }

    @Test
    public void findPetByNameTest() {
        PetService petService = new PetService(pets);

        Optional<Pet> petDog = petService.findPetByName("Barney");
        assertTrue(petDog.isPresent());

        Optional<Pet> nonexistantPet = petService.findPetByName("Kong");
        assertTrue(nonexistantPet.isEmpty());
    }
    
}
