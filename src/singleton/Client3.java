package singleton;

import java.util.concurrent.CountDownLatch;

/**
 * @author：罗金星 date 2019/1/9 15:49
 * 多线程环境下测试这几种方式的方法
 **/
public class Client3 {
    public static void main(String[] args) throws  Exception{
        long start=System.currentTimeMillis();
        CountDownLatch countDownLatch=new CountDownLatch(10);
        for (int j = 0; j <10 ; j++) {
            new Thread(()->{
                for (int i = 0; i <1000000 ; i++) {
                    Object o=SingletonDemo04.getInstance();
                }
                countDownLatch.countDown();
            }).start();
        }
        countDownLatch.await();
        long end=System.currentTimeMillis();
        System.out.println("耗时："+(end-start));
        }



}
