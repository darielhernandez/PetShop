package com.careerdevs;

public class Pet {
    private String name;
    private String species;
    private String sex;
    private int price;

    //constructor
    public Pet(String name, String species, String sex, int price){
    this.name= name;
    this.species= species;
    this.sex= sex;
    this.price= price;
    }

    //getters and setters
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name= name;
    }
    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    //toString method to make data readable to users
    @Override
    public String toString() {
        return "Pet:" +
                "name='" + name + '\''+
                "species='" + species + '\'' +
                ", sex='" + sex + '\'' +
                ", price=" + price +
                ':';
    }
}
