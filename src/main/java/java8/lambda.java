package java8;

import java.util.Arrays;

/**
 * @Author: evilhex
 * @Date: 2019-01-15 10:11
 */
public class lambda {
    public static void main(String[] args) {
        Arrays.asList("a","b","c").forEach(e-> System.out.println(e));
        Arrays.asList( "a", "b", "d" ).forEach( e -> {
            System.out.print( e );
            System.out.print( e );
        } );
        System.out.println();
        final String separator = ",";
        Arrays.asList( "a", "b", "d" ).forEach(
                ( String e ) -> System.out.print( e + separator ) );
    }
}
