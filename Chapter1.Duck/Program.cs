using Chapter1.Duck;

// Simple Duck
var mallard = new MallardDuck();
mallard.PerformFly();
mallard.PerformQuack();

// Injecting new behaviour at runtime
var modelDuck = new ModelDuck();
modelDuck.PerformFly();
modelDuck.PerformQuack();
modelDuck.SetFlyBehaviour(new FlyWithRocket());
modelDuck.PerformFly();

// Using the interface in a separate class with DI
// The new class just delegates Quack() to the supplied IQuackBehaviour
var duckCaller = new DuckCaller(new MatingQuack());
duckCaller.MatingCall();