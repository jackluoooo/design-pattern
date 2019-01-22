package factory.AbstarctFactory;

/**
 * @author：罗金星 date 2019/1/12 16:51
 **/
public class Client {
    public static void main(String[] args) {
        CarFactory factory=new LowCarFactory();
        Engine e=factory.creatEngine();
        e.start();
        e.run();
    }
}
