import bean.User;
import dao.UserDao;

import java.util.ArrayList;

/**
 * @auther 尚智江
 * @Date 2022/5/3 10:49
 */
public class FindAllUsers {
    public static void main(String[] args) {
        // 创建一个 userdao 对象
        UserDao userDao = new UserDao();
        //将 UserDao 对象的 findall()方法执行后的结果放入 list 集合
        ArrayList<User> list = userDao.findAll();
        for (int i = 0; i < list.size(); i++) {
            System.out.println("第" +(i + 1)+"条数据的username为："+list.get(i).getUsername());
        }
    }
}
