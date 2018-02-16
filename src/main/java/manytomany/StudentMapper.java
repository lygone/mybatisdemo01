package manytomany;

/**
 * Created by panyi on 2018/2/16.
 */
public interface StudentMapper {
    public void save(Student stu);

    public Student findById(String stuId);
    //通过学生编号来查询学生及该学生所选修的课程
    public Student findStuAndCoursesById(String stuId);
}
