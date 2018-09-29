package concurrent;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author evilhex
 * 用途：假设要导入4亿数据，开启4个进程，每个进程导入1亿条数据，还希望在导入数据完成插入一条记录就可以使用CyclicBarrierle。
 * Created by evilhex on 2018/3/7.
 */
public class CyclicBarrierTest {

    public static void main(String[] args) {
        int N=4;
        CyclicBarrier cyclicBarrier=new CyclicBarrier(5);
        for (int i=0;i<N;i++){
            new Writer(cyclicBarrier).start();
        }
    }
    static class Writer extends Thread{
        private CyclicBarrier cyclicBarrier;
        public Writer(CyclicBarrier cyclicBarrier){
            this.cyclicBarrier=cyclicBarrier;
        }

        @Override
        public void run() {
            System.out.println("线程"+Thread.currentThread().getName()+"正在写入数据...");
            try {
                //以睡眠来模拟写入数据操作
                Thread.sleep(5000);
                System.out.println("线程"+Thread.currentThread().getName()+"写入数据完毕，等待其他线程写入完毕");
                cyclicBarrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }catch(BrokenBarrierException e){
                e.printStackTrace();
            }
            System.out.println("所有线程写入完毕，继续处理其他任务...");
        }
    }
}
