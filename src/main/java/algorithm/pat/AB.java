package algorithm.pat;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @Author: evilhex
 * @Date: 2019-01-07 10:14
 */
public class AB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            BigInteger A = sc.nextBigInteger();
            BigInteger B = sc.nextBigInteger();
            BigInteger C = sc.nextBigInteger();
            BigInteger sum = A.add(B);
            if (sum.compareTo(C) > 0) {
                System.out.println("Case #" + (i + 1) + ": true");
            } else {
                System.out.println("Case #" + (i + 1) + ": false");
            }
        }
    }
}
