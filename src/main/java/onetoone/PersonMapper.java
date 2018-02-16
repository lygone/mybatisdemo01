package onetoone;

/**
 * Created by panyi on 2018/2/15.
 */
public interface PersonMapper {
    public void save(Person person);

    public Person findById(Integer pid);//同时把身份证也查询上啦

    public Person findSimpleById(Integer pid);//查用户但不查身份证
}
