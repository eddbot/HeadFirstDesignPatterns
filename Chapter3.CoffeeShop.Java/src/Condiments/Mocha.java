package Condiments;

import Beverages.Beverage;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        Double pricing = switch (beverage.getSize()) {
            case TALL -> 0.15;
            case GRANDE -> 0.20;
            case VENTI -> 0.25;
        };
        return beverage.cost() + pricing;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
