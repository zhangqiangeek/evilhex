package headfirst.strategy.impl;

import headfirst.strategy.FlyBehavior;

/**
 * 飞行行为继承飞行接口
 *
 * @author evilhex
 *         2018/3/22.
 */
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can not fly! ");
    }
}
