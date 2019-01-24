package algorithm.pat;

import java.util.Scanner;

/**
 * 输入：m,n
 * 输出：mn到nm之间的所有数字
 *
 * @Author: evilhex
 * @Date: 2019-01-08 10:13
 */
public class jia3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int count = 0;
        int ten = 0;
        int begin = 2;
        while (true) {
            if (suShu(begin)) {
                count++;
                if (count >= m && count <= n) {
                    ten++;
                    System.out.print(begin);
                    if ((!(ten % 10 == 0 && ten != 0)) && (!(count == n))) {
                        System.out.print(" ");
                    }
                }
                if (ten % 10 == 0 && ten != 0) {
                    System.out.println();
                }
                if (count > n) {
                    break;
                }
            }
            begin++;
        }
    }

    static boolean suShu(int num) {
        for (int i = 2; i < Math.sqrt(num+1); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
