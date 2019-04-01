import java.math.BigDecimal;
import java.text.Bidi;

/**
 * @Author: evilhex
 * @Date: 2019-03-12 13:14
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("2019-03-21 00:00:00".substring(0,10));


        BigDecimal zheng=new BigDecimal(-0.01);
        BigDecimal fu=new BigDecimal(0.01);


        System.out.println(zheng.compareTo(fu));
    }
}
