package prototype;

import java.io.Serializable;
import java.util.Date;

/**
 * @author：罗金星 date 2019/1/22 14:13
 **/

public class Sheep implements Cloneable ,Serializable {
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

    public Sheep(String sname, Date birthday) {
        this.sname = sname;
        this.birthday = birthday;
    }

    public Sheep() {
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
        return  obj;
    }
}
