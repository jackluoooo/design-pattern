package factory.AbstarctFactory;

/**
 * @author：罗金星 date 2019/1/12 16:43
 **/
public interface CarFactory {
    Engine  creatEngine();
    Seat  creatSeat();
    Tyre  creatTyre();
}
