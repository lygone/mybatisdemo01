package manytomany;

/**
 * Created by panyi on 2018/2/16.
 */
public class StudentSelectCourse {
    private Integer id;
    private String stuId;
    private String cid;
    private Integer score;
    private String remark;
    private Course course;
    private Student student;

    @Override
    public String toString() {
        return "StudentSelectCourse{" +
                "id=" + id +
                ", stuId='" + stuId + '\'' +
                ", cid='" + cid + '\'' +
                ", score=" + score +
                ", remark='" + remark + '\'' +
                ", course=" + course +
                ", student=" + student +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public StudentSelectCourse() {
    }
}
