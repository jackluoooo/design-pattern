package factory.factorymethod;

/**
 * @author：罗金星 date 2019/1/10 15:03
 **/
public class Client {
    public static void main(String[] args) {
        Car audi=new AudiFactory().createCar();
        audi.run();
    }

}
