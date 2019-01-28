package prototype;

import java.util.Date;

/**
 * @author：罗金星 date 2019/1/22 14:20
 **/
public class Client {
    public static void main(String[] args)  throws Exception{
        /**
         * 浅克隆，只克隆引用
         */
        Date date=new Date(1215313641);
        Sheep s1=new Sheep("少丽",date);
        Sheep s2=(Sheep) s1.clone();

        System.out.println(s1);
        date.setTime(1212222222);
        System.out.println(s1);

        System.out.println(s2);

    }
}
