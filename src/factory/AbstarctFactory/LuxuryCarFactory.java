package factory.AbstarctFactory;

/**
 * @author：罗金星 date 2019/1/12 16:45
 **/
public class LuxuryCarFactory implements CarFactory{
    @Override
    public Engine creatEngine() {
        return new LuxuryEngine();
    }

    @Override
    public Seat creatSeat() {
        return new LuxurySeat();
    }

    @Override
    public Tyre creatTyre() {
        return new LuxuryTyre();
    }
}
