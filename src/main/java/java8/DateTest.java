package java8;

import java.time.LocalDate;

/**
 * @Author: evilhex
 * @Date: 2019-01-23 15:46
 */
public class DateTest {
    LocalDate date = LocalDate.now();

    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalDate.parse("2018-01-24").plusDays(1).toString());
    }
}
