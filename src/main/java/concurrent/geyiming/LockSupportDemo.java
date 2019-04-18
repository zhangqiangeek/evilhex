package concurrent.geyiming;

import java.util.concurrent.locks.LockSupport;

/**
 * @Author: evilhex
 * @Date: 2019-04-11 19:07
 */
public class LockSupportDemo {
    public static void main(String[] args) {
        LockSupport.park();
    }
}
