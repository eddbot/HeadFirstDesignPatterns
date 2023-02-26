package Condiments;

import Beverages.Beverage;

public class SteamedMilk extends CondimentDecorator{
    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        Double pricing = switch (beverage.getSize()) {
            case TALL -> 0.05;
            case GRANDE -> 0.10;
            case VENTI -> 0.15;
        };
        return beverage.cost() + pricing;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Steamed Milk";
    }
}
