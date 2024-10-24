
package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private final static UserService userService = new UserServiceImpl();
    public static void main(String[] args) {

        userService.createUsersTable();

        userService.saveUser("Alice", "Earl", (byte) 20);
        userService.saveUser("Bob", "Feek", (byte) 25);
        userService.saveUser("Clarie", "Garrad", (byte) 31);
        userService.saveUser("Dan", "Hale", (byte) 38);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
