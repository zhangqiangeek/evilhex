import java.lang.instrument.Instrumentation;

/**
 * java agent练习
 *
 * @Author: evilhex
 * @Date: 2019-01-04 17:39
 */
public class MyAgent {

    public static void  premain(String agentOps, Instrumentation inst){

        System.out.println("====premain 方法执行");
        System.out.println(agentOps);
    }

    public static void premain(String agentOps){

        System.out.println("====premain方法执行2====");
        System.out.println(agentOps);
    }
}
