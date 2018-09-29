package headfirst.factory;

/**
 * @author evilhex.
 * @date 2018/8/23 下午3:28.
 */
public abstract class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza ordrPizza(String type) {
        Pizza pizza;
        pizza = caeatePizza(type);
        return pizza;
    }

    abstract Pizza caeatePizza(String type);
}
