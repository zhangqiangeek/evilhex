package headfirst.decorator;

/**
 * @author evilhex.
 * @date 2018/3/28 上午10:54.
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
