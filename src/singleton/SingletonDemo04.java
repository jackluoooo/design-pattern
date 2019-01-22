package singleton;

/**
 * @author：罗金星 date 2019/1/9 14:20
 * 单例模式的静态内部类实现方式
 * 懒加载，线程安全，兼容高并发
 **/
public class SingletonDemo04 {
    private SingletonDemo04() {
    }

    public static SingletonDemo04 getInstance() {
        return SingletonClassInstance.instance;
    }

    private static class SingletonClassInstance {
        //类加载天然的线程安全的
        private static final SingletonDemo04 instance = new SingletonDemo04();
    }
}
