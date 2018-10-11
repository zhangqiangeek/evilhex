package proxy;

/**
 * 动态代理实现类
 *
 * @author evilhex.
 * @date 2018/10/11 下午3:22.
 */
public class PersonDaoImpl implements PersonDao {
    @Override
    public void say() {
        System.out.println("test proxy");
    }
}
