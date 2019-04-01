package interview.foundtion;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author: evilhex
 * @Date: 2019-03-11 17:53
 */
public class Fantype {

    public static <T> int indexOf(T[] arr, T elm) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elm) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str : arrayList) {
            System.out.println(str);
        }
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
