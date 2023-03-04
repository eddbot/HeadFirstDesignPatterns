import Adapters.DuckAdapter;
import Interfaces.Duck;
import Interfaces.MallardDuck;
import Interfaces.Turkey;
import Interfaces.WildTurkey;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {

        // Just duck things
        Duck duck = new MallardDuck();
        duck.Fly();
        duck.Quack();

        // Just turkey things
        Turkey turkey = new WildTurkey();
        turkey.Fly();
        turkey.Gobble();

        // Introduce the adapter
        Duck undercoverTurkey = new DuckAdapter(turkey);

        // Our turkey now acts like a duck!
        undercoverTurkey.Quack();
        undercoverTurkey.Fly();

        // Bonus - how to read from a file :hehe
        try {
            Files.lines(Path.of("src/hello.csv")).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}