package headfirst.strategy;

import headfirst.strategy.impl.FlyNoWay;
import headfirst.strategy.impl.Quack;

/**
 * @author evilhex
 * Created by evilhex on 2018/3/22.
 */
public class ModelDuck extends Duck {

    public ModelDuck(){
        flyBehavior=new FlyNoWay();
        quackBehavior=new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am model duck! ");
    }
}