package easycode;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: evilhex
 * @Date: 2019-05-23 11:27
 */
public class ArrayAsList {
    public static void main(String[] args) {
        String[] stringArray = new String[3];
        stringArray[0] = "one";
        stringArray[1] = "two";
        stringArray[2] = "three";

        List<String> stringList = Arrays.asList(stringArray);
        stringList.set(0, "oneList");
        System.out.println(stringArray[0]);

        // 编译正确，但是抛出异常
        stringList.add("four");
        stringList.remove(2);
        stringList.clear();
    }
}
