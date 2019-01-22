package factory.AbstarctFactory;

public interface Tyre {
    void revolve();
}

class  LuxuryTyre implements  Tyre{
    @Override
    public void revolve() {
        System.out.println("高级轮胎转速快");
    }
}

class  LowTyre implements  Tyre{
    @Override
    public void revolve() {
        System.out.println("低级轮胎也还行");
    }
}

