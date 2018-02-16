package manytomany;

import java.util.List;

/**
 * Created by panyi on 2018/2/16.
 */
public class Course {
    private String cid;
    private String name;
    private String cdesc;
    private Integer xuefeng;
    private List<Student> stus;

    @Override
    public String toString() {
        return "Course{" +
                "cid='" + cid + '\'' +
                ", name='" + name + '\'' +
                ", cdesc='" + cdesc + '\'' +
                ", xuefeng=" + xuefeng +
                ", stus=" + stus +
                '}';
    }

    public Course() {
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCdesc() {
        return cdesc;
    }

    public void setCdesc(String cdesc) {
        this.cdesc = cdesc;
    }

    public Integer getXuefeng() {
        return xuefeng;
    }

    public void setXuefeng(Integer xuefeng) {
        this.xuefeng = xuefeng;
    }

    public List<Student> getStus() {
        return stus;
    }

    public void setStus(List<Student> stus) {
        this.stus = stus;
    }
}
