package com.petstore.demo.entities;

import java.util.List;
//import com.petstore.demo.entities.Pet;

public class Owner {

    private String name;
    private List<Pet> pets;
   

    public Owner(String ownerName){
        this.name = ownerName;
        
        
        //this.pets = ownerPets;
}

        public String getOwnerName() {
            return name;

}
}
