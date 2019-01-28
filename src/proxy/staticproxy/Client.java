package proxy.staticproxy;

/**
 * @author：罗金星 date 2019/1/24 17:26
 **/
public class Client{
    public static void main(String[] args) {
        Star real =new RealStar();
        Star proxy =new ProxyStar(real);
        proxy.confer();
        proxy.signContract();
        proxy.bookTicket();
        proxy.sing();
        proxy.collectMoney();
    }
}
