package adapter;

/**
 * @author：罗金星 date 2019/1/24 16:25
 * 客户端类
 **/
public class Client {
    public void test1(Target t){
         t.handleReq();
    }

    public static void main(String[] args) {
        Client client=new Client();
//        Target t=new Adapter();
//        client.test1(t);

        Adaptee adaptee =new Adaptee();
        Target target=new Adapter2(adaptee);
        client.test1(target);
    }
}
