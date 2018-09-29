package headfirst.decorator;

/**
 * @author evilhex.
 * @date 2018/3/28 上午11:01.
 */
public class Espresso extends Beverage {

    public Espresso(){
        description="Espresso";
    }
    @Override
    public double cost() {
        return 1.99;
    }
}
