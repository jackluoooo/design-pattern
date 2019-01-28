package prototype;

import java.util.Date;

/**
 * @author：罗金星 date 2019/1/22 14:13
 **/

public class Sheep2 implements Cloneable {
    private  String sname;
    private Date birthday;

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Sheep2(String sname, Date birthday) {
        this.sname = sname;
        this.birthday = birthday;
    }

    public Sheep2() {
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "sname='" + sname + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
       Object obj=super.clone();//直接调用object
        //TODO 添加如下代码进行深度赋值
        Sheep2 s=(Sheep2) obj;
        s.birthday=(Date) this.birthday.clone();//把属性也进行拷贝
        return  obj;
    }
}
