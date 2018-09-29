package headfirst.decorator;

/**
 * @author evilhex.
 * @date 2018/3/28 上午11:03.
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
