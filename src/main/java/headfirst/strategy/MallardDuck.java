package headfirst.strategy;

import headfirst.strategy.impl.FlyWithWings;
import headfirst.strategy.impl.Quack;

/**
 * @author evilhex
 *         2018/3/22.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void performQuack() {
        super.performQuack();
    }

    @Override
    public void performFly() {
        super.performFly();
    }

    @Override
    public void display() {
        System.out.println("Im a real Mallard duck");
    }
}
