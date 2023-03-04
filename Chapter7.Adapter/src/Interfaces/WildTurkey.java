package Interfaces;

public class WildTurkey implements Turkey {
    @Override
    public void Gobble() {
        System.out.println("Gobble!");
    }

    @Override
    public void Fly() {
        System.out.println("I'm flying a short distance");
    }
}
