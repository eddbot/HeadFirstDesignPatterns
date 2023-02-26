using Chapter3.CoffeeShop.Models;

// Plain ol' coffee
// => House Blend
var houseBlend = new HouseBlend();
Console.WriteLine(houseBlend.GetDescription());

// Let's make a Double Mocha with Whip!
// => Dark Roast, Mocha, Mocha, Whip
Beverage mocha = new DarkRoast();
mocha.SetSize(Beverage.Size.Venti);
mocha = new Mocha(mocha);
mocha = new Mocha(mocha);
mocha = new Whip(mocha);
Console.WriteLine(mocha.GetDescription());
Console.WriteLine(mocha.Cost());


