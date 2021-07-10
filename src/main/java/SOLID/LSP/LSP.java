package SOLID.LSP;

public class LSP {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.fly();
        animal.noise();
        animal.run();
        animal.walk();

        //Now change dog to duck it would not break code logic

        animal = new Duck();
        animal.fly();
        animal.noise();
        animal.run();
        animal.walk();

        //Now change duck to animal

        animal = new Animal();
        animal.fly();
        animal.noise();
        animal.run();
        animal.walk();
    }
}
