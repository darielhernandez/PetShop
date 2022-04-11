package com.careerdevs;

import java.util.ArrayList;
import java.util.List;

public class petShop {
    //petstore class
    private String petStoreName;
    private List<Pet> availablePets;
    private List<Pet> soldPets;

    //constructor for petstore class.
    public petShop(String petStoreName, List<Pet> availablePets, List<Pet> soldPets) {
        this.petStoreName = petStoreName;
        this.availablePets = new ArrayList<>();
        this.soldPets = new ArrayList<>();
    }
    public petShop(String petStoreName) {
    }

    //getters and setters for petstore class
    public String getPetStoreName() {
        return petStoreName;
    }
    public void setPetStoreName(String petStoreName) {
        this.petStoreName = petStoreName;
    }
    public List<Pet> getAvailablePets() {
        return availablePets;
    }
    public void setAvailablePets(List<Pet> availablePets) {
        this.availablePets = availablePets;
    }
    public List<Pet> getSoldPets() {
        return soldPets;
    }
    public void setSoldPets(List<Pet> soldPets) {
        this.soldPets = soldPets;
    }
    public void buyPet(String name){
        if (availablePets.size()==0){
            System.out.println("Sorry, we're all out of pets! Try again next week.");
            return;
        }
        for (int i = 0; i < availablePets.size(); i++) {
            if (name.equals(availablePets.get(i).getName())){
                System.out.println("You've selected " + availablePets.get(i));
                soldPets.add(availablePets.get(i));
                availablePets.remove(availablePets.get(i));
                return;
            }
        }
    }
    public void returnPet(String name){
        if(soldPets.size()==0){
            System.out.println("Sorry, no pets available!");
            return;
        }
        for (int i = 0; i < soldPets.size(); i++) {
            if(name.equals(soldPets.get(i).getName())){
                System.out.println("You've chosen to break" + soldPets.get(i) + "'s heart. You're a cold bastard");
                availablePets.add(soldPets.get(i));
                soldPets.remove(availablePets.get(i));
                return;
            }
        }
    }

}
