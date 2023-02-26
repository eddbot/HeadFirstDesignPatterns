package Condiments;

import Beverages.Beverage;

public class Whip extends CondimentDecorator{

    public Whip(Beverage beverage) {
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
        return beverage.getDescription() + ", Whip";
    }
}
