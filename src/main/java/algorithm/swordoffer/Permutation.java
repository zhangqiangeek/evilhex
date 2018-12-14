package algorithm.swordoffer;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 字符串的全排列，八皇后都是这些问题的变形
 *
 * @Author: evilhex
 * @Date: 2018-12-14 14:02
 */
public class Permutation {
    static public ArrayList<String> Permutation(String str) {
        ArrayList<String> list = new ArrayList<String>();
        if (str == null || str.length() == 0)
            return list;
        char s[] = str.toCharArray();
        Permutation(s, 0, list);
        Collections.sort(list);
        return list;

    }

    static private void Permutation(char[] s, int i, ArrayList<String> list) {
        String str = null;
        if (i == s.length) {
            str = new String(s);
            list.add(str);
            //System.out.println(str);
        } else {
            for (int j = i; j < s.length; j++) {
                if (i != j && s[i] == s[j])//有重复字符时，跳过
                    continue;
                char temp = s[i];
                s[i] = s[j];
                s[j] = temp;

                Permutation(s, i + 1, list);
                // 复位，否则会有重复的字符串
                temp = s[i];
                s[i] = s[j];
                s[j] = temp;

            }
        }

    }

    public static void main(String[] args) {
        for (String str : Permutation("aba")) {
            System.out.println(str);
        }
    }
}
