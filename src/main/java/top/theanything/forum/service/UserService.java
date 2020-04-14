package top.theanything.forum.service;

import top.theanything.forum.service.model.UserModel;

/**
 * @author zhou
 * @version 1.0.0
 * @ClassName UserService.java
 * @Description
 * @createTime 2020年04月13日 17:46:00
 */
public interface UserService {


    void register(UserModel model);
    Boolean userLogin(String email,String password);

}
