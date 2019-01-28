package composite;

/**
 * @author：罗金星 date 2019/1/25 14:01
 **/
public class Client {
    public static void main(String[] args) {
        AbstractFile f1,f2,f3,f4,f5,f6;
        f1=new Folder("我的收藏");
        f2=new ImageFile("ljx.jpg");
        f3=new TxtFile("hello.txt");
        ((Folder) f1).add(f2);
        ((Folder) f1).add(f3);
        f2.killVirus();
        f1.killVirus();
    }
}
