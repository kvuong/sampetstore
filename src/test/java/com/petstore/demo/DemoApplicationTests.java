package com.petstore.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.petstore.demo.entities.Owner;
import com.petstore.demo.entities.Pet;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void createPetTest() {
		Pet pet = new Pet("Dog", "Barney");
		
		String name = pet.getPetName();
		assertEquals(name, "Jenny");
	}

	@Test
	void createOwnerTest() {
		Owner owner = new Owner("Sam");

		assertEquals(owner.getPets().size(), 0);

		Pet pet = new Pet("Dog", "Barney");
		owner.addPet(pet);

		assertEquals(owner.getPets().get(0).getPetName(), "Barney");
	}
}
