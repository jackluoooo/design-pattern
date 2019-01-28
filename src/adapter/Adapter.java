package adapter;

/**
 * @author：罗金星 date 2019/1/24 16:28
 * 类适配器方式
 **/
public class Adapter extends Adaptee implements Target {
    @Override
    public void handleReq() {
        super.request();//通过继承完成适配的过程
    }

}
