package headfirst.singleton;

/**
 * 枚举类创建单例模式
 *
 * @Author: evilhex
 * @Date: 2018-12-29 10:26
 */
public enum EnumSingletion {
    SINGLETION;

    public static void main(String[] args) {
        System.out.println(EnumSingletion.SINGLETION);
        System.out.println(Runtime.getRuntime());
    }
}
