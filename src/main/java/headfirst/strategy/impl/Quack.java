package headfirst.strategy.impl;

import headfirst.strategy.QuackBehavior;

/**
 * @author evilhex
 *         2018/3/22.
 */
public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack");
    }
}
