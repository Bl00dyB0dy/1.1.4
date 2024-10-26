package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
//import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao getUserDao = new UserDaoHibernateImpl();
    public void createUsersTable() {
        try {
            getUserDao.createUsersTable();
        } catch (Exception e) {
            System.err.println("Ошибка при создании таблицы: " + e.getMessage());
        }
    }

    public void dropUsersTable() {
        try {
            getUserDao.dropUsersTable();
        } catch (Exception e) {
            System.err.println("Ошибка при удалении таблицы: " + e.getMessage());
        }
    }

    public void saveUser(String name, String lastName, byte age) {
        try {
            getUserDao.saveUser(name, lastName, age);
            System.out.println("User с именем – " + name + " добавлен в базу данных");
        } catch (Exception e) {
            System.err.println("Ошибка при сохранении пользователя: " + e.getMessage());
        }
    }

    public void removeUserById (long id) {
        try {
            getUserDao.removeUserById(id);
        } catch (Exception e) {
        System.err.println("Ошибка при удалении пользователя с id = " + id + ": " + e.getMessage());
        }
    }

    public List<User> getAllUsers() {
        try {
            List<User> users = getUserDao.getAllUsers();
            System.out.printf("%-3s\t%-10s\t%-10s\t%-3s%n", "id", "name", "lastName", "age");
            for (User user : users) {
                System.out.println(user);
            }
        } catch (Exception e) {
            System.err.println("Ошибка при получении списка всех пользователей: " + e.getMessage());
        }
        return getUserDao.getAllUsers();
    }

    public void cleanUsersTable() {
        try {
            getUserDao.cleanUsersTable();
        } catch (Exception e) {
            System.err.println("Ошибка при очистке таблицы: " + e.getMessage());
        }
    }
}
