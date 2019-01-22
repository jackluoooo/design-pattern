package factory.factorymethod;

/**
 * @author：罗金星 date 2019/1/10 15:01
 **/
public class AudiFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Audi();
    }
}
