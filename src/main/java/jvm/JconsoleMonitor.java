package jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * 通过jconsole监控jvm
 *
 * @author evilhex.
 * @date 2018/10/30 下午8:48.
 */
public class JconsoleMonitor {
    static class OOMObject {
        public byte[] palceHolder = new byte[64 * 1024];
    }

    public static void fillHeap(int num) throws Exception {
        List<OOMObject> list = new ArrayList<OOMObject>();
        for (int i = 0; i < num; i++) {
            Thread.sleep(50);
            list.add(new OOMObject());
        }
        System.gc();
    }

    public static void main(String[] args) throws Exception {
        fillHeap(1000);
    }

}

