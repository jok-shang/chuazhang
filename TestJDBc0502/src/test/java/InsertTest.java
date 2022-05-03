import bean.User;
import dao.UserDao;

import java.util.Date;

/**
 * @auther 尚智江
 * @Date 2022/5/3 0:30
 */
public class InsertTest {
    public static void main(String[] args) {
        // 向 user 表插入一个用户信息
        UserDao userDao = new UserDao();
        User user = new User();
        user.setId(2);
        user.setUsername("急急急");
        user.setPassword("1111");
        user.setEmail("2859308825@qq.com");
        user.setBirthday(new Date());
        boolean b = userDao.insert(user);
        System.out.println(b);

    }
}
