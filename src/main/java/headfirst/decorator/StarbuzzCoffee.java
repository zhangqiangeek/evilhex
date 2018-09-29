package headfirst.decorator;

/**
 * @author evilhex.
 * @date 2018/3/28 上午11:08.
 */
public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage=new Espresso();
        System.out.println(beverage.getDescription()+"$"+beverage.cost());

        Beverage beverage1=new HouseBlend();
        beverage1=new Mocha(beverage1);
        System.out.println(beverage1.getDescription()+"$"+beverage1.cost());
    }
}
