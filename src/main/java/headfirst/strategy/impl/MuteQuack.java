package headfirst.strategy.impl;

import headfirst.strategy.QuackBehavior;

/**
 * 呱呱叫行为继承呱呱叫接口
 *
 * @author evilhex
 *         2018/3/22.
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
