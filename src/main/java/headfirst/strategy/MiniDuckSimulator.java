package headfirst.strategy;

import headfirst.strategy.impl.FlyRocketPowered;

/**
 * 策略设计模式测试
 *
 * @author evilhex
 *         2018/3/22.
 */
public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new MallardDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
