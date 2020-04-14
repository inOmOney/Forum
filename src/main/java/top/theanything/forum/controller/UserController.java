package top.theanything.forum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import top.theanything.forum.controller.viewObject.UserVO;
import top.theanything.forum.response.CommonReturnType;
import top.theanything.forum.service.UserService;
import top.theanything.forum.service.model.UserModel;
import top.theanything.forum.utils.MurmursHash;

/**
 * @author zhou
 * @version 1.0.0
 * @ClassName UserController.java
 * @Description
 * @createTime 2020年04月13日 17:45:00
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping
    @GetMapping("/register")
    public CommonReturnType register(String userName, String userPassword,
                                     String userShow, String userEmail,
                                     String userPhone, String userSex){
        UserModel usermodel = UserModel.builder()
                .userName(userName)
                .userPassword(MurmursHash.hashUnsignedWithSalt(userPassword))
                .userEmail(userEmail)
                .userPhone(userPhone)
                .userShow(userShow)
                .userSex(userSex)
                .build();
        userService.register(usermodel);
        return CommonReturnType.create(null);
    }

//    @RequestMapping
//    GetMapping("/userlogin")
//        public CommonReturnType userLogin(String email,String password){
//
//
//
//
//        }




}
