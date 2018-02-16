package onetoone;

import java.util.List;

/**
 * Created by panyi on 2018/2/12.
 */
public interface IdCardMapper {
    public void save(IdCard idCard);
    //通过身份证号查询身份证
    public IdCard findById(String CardNo);
    //通过personid来查询身份证
    public IdCard findByPersonId(Integer pid);
}
