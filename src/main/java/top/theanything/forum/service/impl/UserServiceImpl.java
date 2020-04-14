package top.theanything.forum.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.theanything.forum.dao.UserDOMapper;
import top.theanything.forum.dataobject.UserDO;
import top.theanything.forum.service.UserService;
import top.theanything.forum.service.model.UserModel;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author zhou
 * @version 1.0.0
 * @ClassName UserServiceImpl.java
 * @Description
 * @createTime 2020年04月13日 17:46:00
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDOMapper userDOMapper;


    @Override
    public void register(UserModel model) {
        UserDO userDO = userModel2UserDo(model);
        userDOMapper.insertSelective(userDO);
    }

    @Override
    public Boolean userLogin(String email, String password) {
        return null;


    }

    private UserDO userModel2UserDo(UserModel model){
        UserDO userDO = new UserDO();
        BeanUtils.copyProperties(model,userDO);
        userDO.setUserCreatetime(new Date());
        return userDO;
    }
}
