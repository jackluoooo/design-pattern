package bridge;

/**
 * @author：罗金星 date 2019/1/25 11:14
 **/
public class Client {
    public static void main(String[] args) {
        //销售联想台式机
        Computer c=new Desktop(new Lenovo());
        c.sale();
    }
}
