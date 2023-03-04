package Adapters;

import Interfaces.Duck;
import Interfaces.Turkey;

import java.util.stream.IntStream;

public class DuckAdapter implements Duck {

    private final Turkey turkey;

    public DuckAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void Quack() {
        turkey.Gobble();
    }

    @Override
    public void Fly() {
        IntStream.range(0, 5).forEach(i -> turkey.Fly());
    }
}
