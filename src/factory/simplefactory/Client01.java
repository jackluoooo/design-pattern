package factory.simplefactory;

/**
 * @author：罗金星 date 2019/1/10 14:39
 **/
public class Client01 {
    public static void main(String[] args) {
        Car audi=new Audi();
        Car byd=new Byd();

        audi.run();
        byd.run();
    }
}
