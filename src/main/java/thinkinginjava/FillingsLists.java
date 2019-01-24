package thinkinginjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * P460 容器填充
 *
 * @Author: evilhex
 * @Date: 2018-12-29 12:58
 */

class StringAddress {
    private String s;

    public StringAddress(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return super.toString() + "" + s;
    }
}

public class FillingsLists {

    public static void main(String[] args) {
        List<StringAddress> list = new ArrayList<>(Collections.nCopies(4, new StringAddress("Hello")));

        System.out.println(list);

        Collections.fill(list, new StringAddress("World!"));

        System.out.println(list);

    }

}
