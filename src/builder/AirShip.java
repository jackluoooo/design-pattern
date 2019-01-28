package builder;

/**
 * @author：罗金星 date 2019/1/22 16:35
 **/
public class AirShip {
    private OribitaModule oribitaModule;//轨道舱
    private Engine engine;
    private EscapeTower EscapeTower;//逃逸塔

    public void lauch(){
        System.out.println("我要飞了");

    }

    public OribitaModule getOribitaModule() {
        return oribitaModule;
    }

    public void setOribitaModule(OribitaModule oribitaModule) {
        this.oribitaModule = oribitaModule;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public builder.EscapeTower getEscapeTower() {
        return EscapeTower;
    }

    public void setEscapeTower(builder.EscapeTower escapeTower) {
        EscapeTower = escapeTower;
    }
}

class OribitaModule{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OribitaModule(String name) {
        this.name = name;
    }
}

class Engine{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine(String name) {
        this.name = name;
    }
}

class EscapeTower{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EscapeTower(String name) {
        this.name = name;
    }
}

