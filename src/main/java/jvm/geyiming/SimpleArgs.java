package jvm.geyiming;

/**
 * @Author: evilhex
 * @Date: 2019-03-26 15:13
 */
public class SimpleArgs {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("参数" + (i + 1) + ":" + args[i]);
        }
        System.out.println("-XMx" + Runtime.getRuntime().maxMemory() / 1000 / 1000 + "M");
    }
}
