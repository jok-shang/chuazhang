import dao.UserDao;
import bean.User;

/**
 * @auther 尚智江
 * @Date 2022/5/3 10:54
 */
public class FindUserById {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        User user = userDao.find(1);
        System.out.println("id为1的对象的name值为"+user.getUsername());
    }
}
