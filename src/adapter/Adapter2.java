package adapter;

/**
 * @author：罗金星 date 2019/1/24 16:28
 *
 **/
public class Adapter2  implements Target {
    private  Adaptee adaptee;
    @Override
    public void handleReq() {
        adaptee.request();
    }

    public Adapter2(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
}
