package top.theanything.forum.service.model;

import lombok.Builder;
import lombok.Data;

/**
 * @author zhou
 * @version 1.0.0
 * @ClassName UserModel.java
 * @Description
 * @createTime 2020年04月13日 17:48:00
 */
@Builder
@Data
public class UserModel {


    private Long userId;
    private String userName;
    private String userEmail;
    private String userPassword;
    private String userPhone;
    private String userSex;
    private String userShow;




}
