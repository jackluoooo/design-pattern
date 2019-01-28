package prototype;

import java.util.Date;

/**
 * @author：罗金星 date 2019/1/22 14:20
 **/
public class Client02 {
    public static void main(String[] args)  throws Exception{
        /**
         * 深克隆
         */
        Date date=new Date(1215313641);
        Sheep2 s1=new Sheep2("少丽",date);
        Sheep2 s2=(Sheep2) s1.clone();
        System.out.println(s1);

        date.setTime(1212222222);

        System.out.println(s1);

        s2.setSname("多莉");
        System.out.println(s2);
    }
}
