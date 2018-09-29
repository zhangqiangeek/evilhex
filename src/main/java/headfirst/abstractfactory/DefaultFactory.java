package headfirst.abstractfactory;

/**
 * @author evilhex.
 * @date 2018/3/29 下午7:23.
 */
public class DefaultFactory extends AbstractFactory {

    @Override
    public Vehicle createVehicle() {
        return new Car();
    }

    @Override
    public Weapon createWeapon() {
        return new AK47();
    }

    @Override
    public Food createFood() {
        return new Apple();
    }
}
