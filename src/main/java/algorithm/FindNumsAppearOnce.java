package algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by evilhex on 2018/3/17.
 */
public class FindNumsAppearOnce {
    static public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        Map<Integer,Integer> map=new HashMap<Integer, Integer>();
        for (int i=0;i<array.length;i++){
            if (map.get(array[i])==null){
                map.put(array[i],1);
            }else {
                map.remove(array[i]);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            num1[0]=entry.getKey();

        }

    }

    public static void main(String[] args) {
        int[] array={2,4,3,6,3,2,5,5};
        int[] num1=null,num2=null;
        FindNumsAppearOnce(array,num1,num2);
        System.out.println(num1[0]+"  "+num2[0]);
    }
}
