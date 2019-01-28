package builder;

/**
 * @author：罗金星 date 2019/1/22 17:18
 **/
public class SxtAirShipDirector implements  AirShipDirecttor{
    private  AirShipBuilder builder;
    public  SxtAirShipDirector(AirShipBuilder builder){
        this.builder=builder;
    }
    @Override
    public AirShip directAirship() {
        Engine e=builder.buildEngine();
        OribitaModule oribitaModule = builder.buildOribitaModule();
        EscapeTower escapeTower = builder.builderEscapeTower();

        AirShip ship=new AirShip();
        ship.setEngine(e);
        ship.setEscapeTower(escapeTower);
        ship.setOribitaModule(oribitaModule);
        return ship;
    }
}
