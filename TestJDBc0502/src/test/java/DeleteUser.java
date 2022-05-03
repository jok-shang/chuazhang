import dao.UserDao;

/**
 * @auther 尚智江
 * @Date 2022/5/3 11:02
 */
public class DeleteUser {
    public static void main(String[] args) {
        // 删除
        UserDao userDao = new UserDao();
        boolean b = userDao.delete(1);
        System.out.println(b);
    }
}
