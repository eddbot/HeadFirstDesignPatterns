package Condiments;

import Beverages.Beverage;

public class Soy extends CondimentDecorator{

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        Double pricing = switch (beverage.getSize()) {
            case TALL -> 0.10;
            case GRANDE -> 0.15;
            case VENTI -> 0.20;
        };
        return beverage.cost() + pricing;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
