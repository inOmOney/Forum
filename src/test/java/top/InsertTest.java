package top;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.theanything.forum.App;
import top.theanything.forum.dao.UserDOMapper;
import top.theanything.forum.dataobject.UserDO;

import java.util.Date;

/**
 * @author zhou
 * @version 1.0.0
 * @ClassName InsertTest.java
 * @Description
 * @createTime 2020年04月13日 22:49:00
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class InsertTest {

    @Autowired
    private UserDOMapper userDOMapper;

    @Test
    public void test(){
        UserDO userDO = new UserDO(null,"123","123",
                "123","123","123","123",
                new Date());
        int i = userDOMapper.insertSelective(userDO);
        System.out.println(123);

    }


}
