package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//public class UserDaoJDBCImpl implements UserDao {
/*    Connection conn = Util.getConnection();
    public UserDaoJDBCImpl() {

    }

    public void createUsersTable() {
        String tableCreate = "CREATE TABLE IF NOT EXISTS users (Id BIGINT PRIMARY KEY AUTO_INCREMENT, Name VARCHAR(20), LastName VARCHAR (20), Age TINYINT)";
        try (PreparedStatement statement1 = conn.prepareStatement(tableCreate)) {
            statement1.executeUpdate();
            conn.commit();
        } catch (SQLException e) {
            System.out.println("SQLException. Executing rollback");
            try {
                conn.rollback();
            } catch (SQLException ex) {
            }
        }
    }

    public void dropUsersTable() {
        try (PreparedStatement statement2 = conn.prepareStatement("DROP TABLE IF EXISTS users")) {
            statement2.executeUpdate();
            conn.commit();
        } catch (SQLException e) {
            System.out.println("SQLException. Executing rollback");
            try {
                conn.rollback();
            } catch (SQLException ex) {
            }
        }
    }

    public void saveUser(String name, String lastName, byte age) {
        try {
            PreparedStatement statement3 = conn.prepareStatement("INSERT INTO users (Name, LastName, Age) VALUES (?, ?, ?)");
            statement3.setString(1, name);
            statement3.setString(2, lastName);
            statement3.setByte(3, age);
            statement3.executeUpdate();
            conn.commit();
            System.out.printf("User с именем — %s добавлен в базу данных\n", name);
            statement3.close();
        } catch (SQLException e) {
            System.out.println("SQLException. Executing rollback");
            try {
                conn.rollback();
            } catch (SQLException ex) {
            }
        }
    }

    public void removeUserById(long id) {
        try (PreparedStatement statement4 = conn.prepareStatement("DELETE FROM users WHERE Id = ?")) {
            statement4.setLong(1, id);
            statement4.executeUpdate();
            conn.commit();
        } catch (SQLException e) {
            System.out.println("SQLException. Executing rollback");
            try {
                conn.rollback();
            } catch (SQLException ex) {
            }
        }
    }

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        try (Statement statement5 = conn.createStatement()) {
            ResultSet resultSet = statement5.executeQuery("SELECT * FROM users");
            conn.commit();
            while (resultSet.next()) {
                users.add(new User(resultSet.getString("Name"), resultSet.getString("LastName"), resultSet.getByte("Age")));
            }
            for (User user : users) {
                System.out.println(user.toString());
            }
            resultSet.close();
        } catch (SQLException e) {
        }
        return users;
    }

    public void cleanUsersTable() {
        try (Statement statement6 = conn.createStatement()) {
            statement6.executeUpdate("TRUNCATE users");
            conn.commit();
        } catch (SQLException e) {
            System.out.println("SQLException. Executing rollback");
            try {
                conn.rollback();
            } catch (SQLException ex) {
            }
        }

    }
} */