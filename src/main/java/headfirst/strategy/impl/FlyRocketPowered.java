package headfirst.strategy.impl;

import headfirst.strategy.FlyBehavior;

/**
 * @author evilhex
 *         2018/3/22.
 */
public class FlyRocketPowered implements FlyBehavior {

    public void fly() {
        System.out.println("I am flying with a rocket! ");
    }
}
