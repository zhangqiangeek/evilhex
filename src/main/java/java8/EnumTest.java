package java8;

/**
 * @Author: evilhex
 * @Date: 2019-05-08 10:15
 */
public class EnumTest {
    public static void main(String[] args) {
        System.out.println(PayChannelEnum.getPayChannelDesc(1));
    }
}

enum PayChannelEnum {

    WEIXIN(1, "微信"), ALIPAY(2, "支付宝");

    PayChannelEnum(Integer payChannel, String payChannelDesc) {
    }

    public static String getPayChannelDesc(Integer payChannel) {
        if (null == payChannel) {
            return "";
        }
        PayChannelEnum[] enums = PayChannelEnum.values();
        for (PayChannelEnum ele : enums) {
            if (ele.ordinal() == payChannel) {
                return ele.name();
            }
        }
        return null;
    }
}


