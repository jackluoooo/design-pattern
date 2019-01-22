package singleton;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * @author：罗金星 date 2019/1/9 14:46
 **/
public class Client2 {
    public static void main(String[] args) throws  Exception{
        SingletonDemo06 instance=SingletonDemo06.getInstance();
        SingletonDemo06 instance02=SingletonDemo06.getInstance();
        System.out.println(instance);
        System.out.println(instance02);

        //反射破解懒汉式单例，创建多个对象
//        Class<SingletonDemo06> clazz= (Class<SingletonDemo06>)Class.forName("singleton.SingletonDemo06");
//        Constructor<SingletonDemo06> constructor= clazz.getDeclaredConstructor(null);
//        constructor.setAccessible(true);
//        SingletonDemo06 s3=constructor.newInstance();
//        SingletonDemo06 s4=constructor.newInstance();
//        System.out.println(s3);
//        System.out.println(s4);


        //通过反序列化方式创建多个对象
        FileOutputStream fos=new FileOutputStream("d:"+File.separator+"a.txt");
        ObjectOutputStream oos =new ObjectOutputStream(fos);
        oos.writeObject(instance);
        oos.close();
        fos.close();

        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("d:"+File.separator+"a.txt") );
        SingletonDemo06 s3=(SingletonDemo06) ois.readObject();
        System.out.println(s3);
    }


}
