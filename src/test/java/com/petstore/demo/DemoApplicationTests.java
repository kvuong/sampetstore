package com.petstore.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.petstore.demo.entities.Pet;
import com.petstore.demo.entities.Owner;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void createPetTest(){
		Pet pet = new Pet("Dog","jim", "Todd");

		String name = pet.getPetName();
		assertEquals(name, "jim");
		String type = pet.getPetType();
		assertEquals(type, "Dog");

	}
	@Test
	void createOwnerTest(){
		Owner owner = new Owner("Todd");

		String name = owner.getOwnerName();
		assertEquals(name, "Todd");
	}
}
