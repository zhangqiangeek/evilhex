package headfirst.strategy;

/**
 * @author evilhex
 *         2018/3/9.
 */
public abstract class Duck {

    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public abstract void display();

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public void swim() {
        System.out.println("All ducks  oat, even decoys!");
    }
}
