package singleton;

import java.io.File;
import java.io.FileOutputStream;

/**
 * @author：罗金星 date 2019/1/9 14:46
 **/
public class Client {
    public static void main(String[] args) {
        SingletonDemo01 instance=SingletonDemo01.getInstance();
        SingletonDemo01 instance02=SingletonDemo01.getInstance();
        System.out.println(instance);
        System.out.println(instance02);

    }
}
