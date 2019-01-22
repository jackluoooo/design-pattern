package singleton;

/**
 * @author：罗金星 date 2019/1/9 13:57
 * 懒汉式
 **/
public class SingletonDemo02 {
    private static SingletonDemo02 instance;//延迟加载

    private SingletonDemo02() {}

    public static synchronized SingletonDemo02 getInstance(){//synchronized 保证线程安全，但并发效率变低
        if (instance == null) {
            instance = new SingletonDemo02();
        }
        return instance;
    }
}
