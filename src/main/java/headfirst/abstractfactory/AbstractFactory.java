package headfirst.abstractfactory;

/**
 * @author evilhex.
 * @date 2018/3/29 下午8:10.
 */
public abstract class AbstractFactory {
    public abstract Vehicle createVehicle();
    public abstract  Weapon createWeapon();
    public abstract Food createFood();
}
