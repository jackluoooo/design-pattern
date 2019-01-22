package factory.simplefactory;

/**
 * @author：罗金星 date 2019/1/10 14:39
 * 简单Factory
 **/
public class Client02 {
    public static void main(String[] args) {
        Car audi=CarFactory.creatCar("audi");
        Car byd=CarFactory.creatCar("byd");

        audi.run();
        byd.run();
    }
}
