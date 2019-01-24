package java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Author: evilhex
 * @Date: 2019-01-16 10:36
 */
public class GroupTest {


    public static void main(String[] args) {

        List<People> peopleList = new ArrayList<>();
        peopleList.add(new People("2019-01-01", 1, "1"));
        peopleList.add(new People("2019-01-01", 2, "2"));
        peopleList.add(new People("2019-01-02", 1, "3"));
        peopleList.add(new People("2019-01-02", 2, "4"));
        peopleList.add(new People("2019-01-03", 1, "5"));
        peopleList.add(new People("2019-01-03", 1, "6"));

        Map<String, Map<Integer, List<People>>> multiMap = peopleList
                .parallelStream()
                .collect(Collectors.groupingBy(People::getData,
                        Collectors.groupingBy(People::getChannel)));

        for (Map.Entry entry : multiMap.entrySet()) {
            Map<Integer, List<People>> map = (Map<Integer, List<People>>) entry.getValue();
            for (Map.Entry entry1 : map.entrySet()) {

                List<People> peopleList1 = (List<People>) entry1.getValue();
            }
        }


        System.out.println("test");


        Map<String,People> map=new HashMap<>();
        map.put(new String("test"),new People("2019-01-01", 1, "1"));
        map.put(new String("test"),new People("2019-01-01", 2, "2"));


        System.out.println("test");
    }
}
