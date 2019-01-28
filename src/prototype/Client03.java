package prototype;

import java.io.*;
import java.util.Date;

/**
 * @author：罗金星 date 2019/1/22 14:20
 **/
public class Client03 {
    public static void main(String[] args)  throws Exception{
        /**
         * 深克隆
         */
        Date date=new Date(1215313641);
        Sheep s1=new Sheep("少丽",date);

//        Sheep2 s2=(Sheep2) s1.clone();
        //TODO 使用序列化与反序列化实现深克隆
        ByteArrayOutputStream bos=new ByteArrayOutputStream();
        ObjectOutputStream oos=new ObjectOutputStream(bos);
        oos.writeObject(s1);
        byte[] bytes =bos.toByteArray();//序列化内容给一个数组

        ByteArrayInputStream bis=new ByteArrayInputStream(bytes);
        ObjectInputStream ois=new ObjectInputStream(bis);

        Sheep s2=(Sheep) ois.readObject();


        System.out.println(s1);

        date.setTime(1212222222);

        System.out.println(s1);

        s2.setSname("多莉");
        System.out.println(s2);
    }
}
