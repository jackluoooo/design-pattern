package singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @author：罗金星 date 2019/1/9 13:57
 * 懒汉式--如防止反射与反序列化漏洞
 **/
public class SingletonDemo06 implements Serializable {
    private static SingletonDemo06 instance;//延迟加载

    private SingletonDemo06() {
        if(instance!=null){
            //防止反射创建
            throw new RuntimeException();
        }
    }

    public static synchronized SingletonDemo06 getInstance(){//synchronized 保证线程安全，但并发效率变低
        if (instance == null) {
            instance = new SingletonDemo06();
        }
        return instance;
    }
   // 反序列化是返回此方法直接调用此对象
    private Object readResolve() throws ObjectStreamException {
        return instance;
    }

}
