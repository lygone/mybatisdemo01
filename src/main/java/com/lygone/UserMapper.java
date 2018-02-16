package com.lygone;

/**
 * Created by panyi on 2018/2/11.
 */
public interface UserMapper {
    public boolean save(User user);
    public User findById(String uid);
}
