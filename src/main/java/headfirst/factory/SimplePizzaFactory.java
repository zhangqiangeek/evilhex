package headfirst.factory;

/**
 * @author evilhex.
 * @date 2018/8/23 下午3:46.
 */
public class SimplePizzaFactory {
    public Pizza caeatePizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            return new Pizza();
        }
        return pizza;
    }
}