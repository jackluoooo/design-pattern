package prototype;

/**
 * @author：罗金星 date 2019/1/22 15:37
 * 性能相差太大
 * clone应用场景，短时间生产大量对象
 **/
public class Client4 {
    public static void main(String[] args) throws Exception{
        testNew(100);
        testClone(100);

    }
    public static void testNew(int size){
        Long start=System.currentTimeMillis();
        for(int i=0;i<size;i++){
            Laptop laptop=new Laptop();
        }
        Long end=System.currentTimeMillis();
        System.out.println("new的方式创建耗时："+(end-start));
    }

    public static void testClone(int size) throws CloneNotSupportedException{
        Long start=System.currentTimeMillis();
        Laptop t=new Laptop();
        for(int i=0;i<size;i++){
            Laptop laptop=(Laptop)t.clone();
        }
        Long end=System.currentTimeMillis();
        System.out.println("clone的方式创建耗时："+(end-start));
    }
}

class Laptop implements Cloneable{//笔记本电脑
    public Laptop(){
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
