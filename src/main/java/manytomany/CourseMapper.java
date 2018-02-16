package manytomany;

/**
 * Created by panyi on 2018/2/16.
 */
public interface CourseMapper {
    public void save(Course course);

    public Course findById(String cid);

    public Course findCourseAndStusById(String cid);
}
