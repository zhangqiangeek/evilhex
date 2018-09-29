package headfirst.abstractfactory;

/**
 * 控制一系列产品的产生
 *
 * @author evilhex.
 * @date 2018/3/29 下午3:33.
 */
public class Test {

    public static void main(String[] args) {
        AbstractFactory f = new DefaultFactory();
        Vehicle v = f.createVehicle();
        v.run();
        Weapon w = f.createWeapon();
        w.shoot();
        Food a = f.createFood();
        a.pringName();

    }
}
