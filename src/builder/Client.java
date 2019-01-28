package builder;

/**
 * @author：罗金星 date 2019/1/22 17:29
 **/
public class Client {
    public static void main(String[] args) {
        AirShipDirecttor directtor =new SxtAirShipDirector(new SxtAirShipBuilder());//通过构造方法传入
        AirShip ship =directtor.directAirship();
        System.out.println(ship.getEngine().getName());
        ship.lauch();
    }

}
