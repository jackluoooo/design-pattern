package proxy.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * @author：罗金星 date 2019/1/24 17:45
 **/
public class Client {
    public static void main(String[] args) {
        Star realStar=new RealStar();
        StartHandler handler =new StartHandler(realStar);
        Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Star.class}, handler);
        //调用代理类方法都会进入handler
        proxy.bookTicket();
        proxy.sing();//代理只能让真时明星唱歌

    }
}
