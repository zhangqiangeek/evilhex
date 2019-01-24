package algorithm.pat;

import java.util.Scanner;

/**
 * 福尔摩斯的约会
 *
 * @Author: evilhex
 * @Date: 2019-01-08 10:51
 */
public class jia4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            char[] char1 = scanner.nextLine().toCharArray();
            char[] char2 = scanner.nextLine().toCharArray();
            char[] char3 = scanner.nextLine().toCharArray();
            char[] char4 = scanner.nextLine().toCharArray();
            StringBuilder sb = new StringBuilder();
            String[] one = new String[]{"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
            char first = 'A';
            char second = 'A';
            String third = "";
            boolean flag = false;
            int count = 0;
            for (int i = 0; i < char1.length && i < char2.length; i++) {
                if (char1[i] == char2[i]) {
                    if (isBigEn(char1[i]) && count == 0) {
                        first = char1[i];
                        flag = true;
                        count++;
                        continue;
                    }
                    if (flag) {
                        second = char1[i];
                        break;
                    }

                }

            }
            String temp = "";
            if (second >= 'A' && second <= 'N') {
                temp = String.valueOf(second - 'A' + 10);
            }
            if (second >='0' && second <='9') {
                temp = "0" + second;
            }
            for (int i = 0; i < char3.length && i < char4.length; i++) {
                if (char3[i] == char4[i]) {
                    if (char3[i] > 'a' && char3[i] < 'z') {
                        if (i <= 9) {
                            third = "0" + i;
                        } else {
                            third = String.valueOf(i);
                        }
                        break;
                    }
                }
            }
            sb.append(one[first - 'A'] + " ");
            sb.append(temp + ":");
            sb.append(third);
            System.out.println(sb.toString());
        }
    }

    private static boolean isBigEn(char c) {
        if (c >= 'A' && c <= 'Z') {
            return true;
        }
        return false;
    }

}
