package singleton;

/**
 * @author：罗金星 date 2019/1/9 14:30
 * 单例枚举方式，没有懒加载
 **/
public enum  SingletonDemo05 {
        INSTANCE;
    //避免反射和反序列化的漏洞创建新的对象。
    public void singletonOperation(){

    }
}
