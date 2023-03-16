package Lesson15Ex;

public class Main {

    public static void main(String[] args) {

        Animal elephant1 = new Elephant("Indian Elephant", 10, 5400.76);
        Animal elephant2 = new Elephant("African Elephant", 29, 6000.11);
        Animal lion = new Lion("lioness", 8, 130.57);
        Animal tiger = new Tiger("Siberian Tiger", 9, 122.93);
        Animal wolf = new Wolf("Alaskan Wolf", 4, 38.22);
        Animal zebra = new Zebra("Mountain Zebra", 2, 240.67);

        Zoo zoo = new Zoo();

        zoo.newAnimal(elephant1);
        zoo.newAnimal(elephant2);
        zoo.newAnimal(lion);
        zoo.newAnimal(tiger);
        zoo.newAnimal(wolf);
        zoo.newAnimal(zebra);

        System.out.println(zoo.printAnimals());

        //[[Indian Elephant, age: 10, weight: 5400.76], [African Elephant, age: 29, weight: 6000.11], [lioness, age: 8, weight: 130.57], [Siberian Tiger, age: 9, weight: 122.93], [Alaskan Wolf, age: 4, weight: 38.22], [Mountain Zebra, age: 2, weight: 240.67]]
    }
}

