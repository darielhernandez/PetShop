package com.careerdevs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //initialize scanner
        Scanner scanner= new Scanner(System.in);

    //instances of pets
    Pet pet1= new Pet("Fluffy", "Dog","M", 299);
    Pet pet2= new Pet("Sphinx", "Cat", "F", 299);
    Pet pet3= new Pet("Polly", "Parrot", "F", 999);

    petShop petShop= new petShop("Dariels Dogs n more");
    petShop.getAvailablePets().add(pet1);
    petShop.getAvailablePets().add(pet2);
    petShop.getAvailablePets().add(pet3);

    }
}
