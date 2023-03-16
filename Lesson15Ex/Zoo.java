package Lesson15Ex;

import java.util.ArrayList;

public class Zoo {
    public ArrayList<Animal> zooAnimals;
    //arraylist of Animal objects called zooAnimals

    public Zoo() {
        this.zooAnimals = new ArrayList<Animal>();
    }

    public void newAnimal(Animal animal) {
        zooAnimals.add(animal);
    } //method to add new animal

    public ArrayList<Animal> printAnimals() {
        return zooAnimals;
    } //returns list of zooAnimals


}
