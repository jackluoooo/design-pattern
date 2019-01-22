package singleton;

/**
 * @author：罗金星 date 2019/1/9 13:46
 * 测试饿汉式单例
 **/
public class SingletonDemo01 {
    private  static  SingletonDemo01 instance=new SingletonDemo01();//类初始化则立即加载，优点线程安全，类初始化时天然的线程安全；缺点耗内存
    private SingletonDemo01() {
    }
    public static SingletonDemo01 getInstance(){
        return instance;
    }
}
