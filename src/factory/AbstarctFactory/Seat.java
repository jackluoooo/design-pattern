package factory.AbstarctFactory;

public interface Seat {
    void message();
}

 class LuxurySeat implements  Seat{
    @Override
    public void message() {
        System.out.println("可以按摩的高端座椅");
    }
}

class LowSeat implements  Seat{
    @Override
    public void message() {
        System.out.println("低端座椅也可以");
    }
}