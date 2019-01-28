package builder;

/**
 * @author：罗金星 date 2019/1/22 16:53
 **/
public class SxtAirShipBuilder implements AirShipBuilder{
    @Override
    public Engine buildEngine() {
        System.out.println("构建发动机");
        return new Engine("JACKLUO的发动机");
    }

    @Override
    public OribitaModule buildOribitaModule() {
        System.out.println("轨道舱");
        return new OribitaModule("JACKLUO的轨道舱");
    }

    @Override
    public EscapeTower builderEscapeTower() {
        System.out.println("构建逃逸塔");
        return new EscapeTower("JACKLUO的逃逸塔");
    }
}
