using Chapter3.CoffeeShop.Models;

// Plain ol' coffee
// => House Blend
var houseBlend = new HouseBlend();
Console.WriteLine(houseBlend.GetDescription());

// Let's make a Double Mocha with Whip!
// => Dark Roast, Mocha, Mocha, Whip
Beverage darkRoastMocha = new DarkRoast();
darkRoastMocha.SetSize(Beverage.Size.Grande);
darkRoastMocha = new Mocha(darkRoastMocha);
darkRoastMocha = new Mocha(darkRoastMocha);
darkRoastMocha = new Whip(darkRoastMocha);
Console.WriteLine(darkRoastMocha.GetDescription());
Console.WriteLine(darkRoastMocha.Cost());


