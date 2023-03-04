package Interfaces;

public class MallardDuck implements Duck {
    @Override
    public void Quack() {
        System.out.println("Quack!");

    }

    @Override
    public void Fly() {
        System.out.println("I'm flying!");
    }
}
