package top.theanything.forum.controller.viewObject;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhou
 * @version 1.0.0
 * @ClassName UserVO.java
 * @Description
 * @createTime 2020年04月13日 17:53:00
 */

@Data
@AllArgsConstructor
@Builder
public class UserVO {
    private Long userId;
    private String userName;
    private String userEmail;
    private String userPassword;
    private String userPhone;
    private String userSex;

}
