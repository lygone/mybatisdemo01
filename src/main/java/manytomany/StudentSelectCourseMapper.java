package manytomany;

import org.apache.ibatis.annotations.Param;

/**
 * Created by panyi on 2018/2/16.
 */
public interface StudentSelectCourseMapper {
    public void save(StudentSelectCourse ssc);

    public StudentSelectCourse findById(Integer id);

    public StudentSelectCourse findByStuidAndCid(@Param("stuId")String stuId,@Param("cid")String cid);
}
