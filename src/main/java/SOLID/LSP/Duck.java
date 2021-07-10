package SOLID.LSP;

public class Duck extends Animal {
    @Override
    public void fly() {
        System.out.println("Fly's");
    }

    @Override
    public void noise() {
        System.out.println("Quack");
    }
}
