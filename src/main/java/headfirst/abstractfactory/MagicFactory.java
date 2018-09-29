package headfirst.abstractfactory;

/**
 * @author evilhex.
 * @date 2018/3/29 下午8:04.
 */
public class MagicFactory extends AbstractFactory {

    @Override
    public Vehicle createVehicle() {
        return new Broom();
    }

    @Override
    public Weapon createWeapon() {
        return new MagicStick();
    }

    @Override
    public Food createFood() {
        return new MushRoom();
    }
}
