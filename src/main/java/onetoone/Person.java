package onetoone;

import java.util.Date;

/**
 * Created by panyi on 2018/2/12.
 */
public class Person {
    private int pid;
    private String name;
    private String sex;
    private Date birthday;
    private IdCard idcard;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", idcard=" + idcard +
                '}';
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public IdCard getIdcard() {
        return idcard;
    }

    public void setIdcard(IdCard idcard) {
        this.idcard = idcard;
    }
}
