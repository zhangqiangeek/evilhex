package headfirst.abstractfactory;

/**
 * 工厂设计模式
 *
 * @author evilhex.
 * @date 2018/3/29 下午3:32.
 */
public class Car extends Vehicle {

    @Override
    public void run() {
        System.out.println("冒着烟奔跑中的car");
    }

}
