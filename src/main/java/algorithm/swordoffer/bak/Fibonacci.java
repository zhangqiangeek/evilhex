package algorithm.swordoffer.bak;

/**
 * 斐波那契数列
 *
 * @Author: evilhex
 * @Date: 2018-12-04 11:48
 */
public class Fibonacci {
    public static int Fibonacci(int n) {
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        return Fibonacci(n-1)+Fibonacci(n-2);
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci(10));
    }
}
