package test;

import com.wmh.bean.User;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: UserTest
 * @Description: TODO
 * @Author: isiy
 * @Date: 2023/6/3 0:18
 * @Version: 1.0
 **/
public class UserTest {

    @Test
    public void testUser(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        User userBean = applicationContext.getBean("userBean",User.class);
        userBean.eat();
        Logger logger1 = LoggerFactory.getLogger(UserTest.class);
        logger1.debug("debug信息");

    }

    @Test
    public void testUserClss(){


    }

}
