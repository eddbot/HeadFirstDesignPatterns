import Adapters.DuckAdapter;
import Interfaces.Duck;
import Interfaces.MallardDuck;
import Interfaces.Turkey;
import Interfaces.WildTurkey;

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
    }
}