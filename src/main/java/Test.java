import java.math.BigDecimal;

/**
 * @Author: evilhex
 * @Date: 2019-04-19 18:43
 */
public class Test {

    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal(482.43).multiply(new BigDecimal(0.22)).setScale(2, BigDecimal.ROUND_HALF_UP);
        System.out.println(bigDecimal.toString());
    }
}
