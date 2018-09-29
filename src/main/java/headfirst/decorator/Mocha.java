package headfirst.decorator;

/**
 * @author evilhex.
 * @date 2018/3/28 上午11:05.
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha! ";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
