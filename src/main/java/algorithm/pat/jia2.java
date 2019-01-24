package algorithm.pat;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @Author: evilhex
 * @Date: 2019-01-07 10:27
 */
public class jia2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int A1 = 0;
        int A2 = 0;
        int A3 = 0;
        BigDecimal A4 = new BigDecimal(0);
        int A5 = 0;

        boolean flag = true;
        int count = 0;
        BigDecimal sum = new BigDecimal(0);
        DecimalFormat decimalFormat = new DecimalFormat("0.0");
        for (int i = 0; i < N; i++) {
            int cur = sc.nextInt();
            // 能被5整除的数字中所有偶数的和；
            if (cur % 5 == 0) {
                if (cur % 2 == 0) {
                    A1 += cur;
                }
            }
            // 将被5除后余1的数字按给出顺序进行交错求和，即计算n1-n2+n3-n4...；
            if (cur % 5 == 1) {
                if (flag) {
                    A2 += cur;
                    flag = false;
                } else {
                    A2 -= cur;
                    flag = true;
                }
            }
            // 被5除后余2的数字的个数；
            if (cur % 5 == 2) {
                A3 += 1;
            }
            // 被5除后余3的数字的平均数，精确到小数点后1位；
            if (cur % 5 == 3) {
                count++;
                sum=sum.add(new BigDecimal(cur));
            }
            if (count != 0) {
                A4 = sum.divide(new BigDecimal(count),2,BigDecimal.ROUND_HALF_UP);
            }

            // 被5除后余4的数字中最大数字。
            if (cur % 5 == 4) {
                if (cur > A5) {
                    A5 = cur;
                }
            }
        }

        if (A1 == 0) {
            System.out.print("N" + " ");
        } else {
            System.out.print(A1 + " ");
        }

        if (A2 == 0) {
            System.out.print("N" + " ");
        } else {
            System.out.print(A2 + " ");
        }
        if (A3 == 0) {
            System.out.print("N" + " ");
        } else {
            System.out.print(A3 + " ");
        }
        if (A4.compareTo(new BigDecimal(0)) == 0) {
            System.out.print("N" + " ");
        } else {
            System.out.print(decimalFormat.format(A4) + " ");
        }
        if (A5 == 0) {
            System.out.print("N");
        } else {
            System.out.print(A5);
        }
    }
}
