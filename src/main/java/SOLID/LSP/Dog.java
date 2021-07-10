package SOLID.LSP;

public class Dog extends Animal {
    @Override
    public void fly() {}

    @Override
    public void noise() {
        System.out.println("Bark");
    }
}
