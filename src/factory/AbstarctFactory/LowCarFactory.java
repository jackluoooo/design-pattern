package factory.AbstarctFactory;

/**
 * @author：罗金星 date 2019/1/12 16:45
 **/
public class LowCarFactory implements CarFactory {
    @Override
    public Engine creatEngine() {
        return new LowEngine();
    }

    @Override
    public Seat creatSeat() {
        return new LowSeat();
    }

    @Override
    public Tyre creatTyre() {
        return new LowTyre();
    }
}
