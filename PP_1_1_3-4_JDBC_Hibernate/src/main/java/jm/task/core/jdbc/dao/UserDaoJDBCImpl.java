package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;

import java.util.List;


public class UserDaoJDBCImpl implements UserDao {
//    private static final Connection connect = Util.getConnection();

    public UserDaoJDBCImpl() {
    }

    public void createUsersTable() {
//        try (Statement statement = connect.createStatement()) {
//            statement.executeUpdate("CREATE TABLE IF NOT EXISTS users (id BIGINT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(255), last_name VARCHAR(255), age INT)");
//            System.out.println("Таблица создана...");
//        } catch (SQLException e) {
//            e.printStackTrace();
//            System.out.println("Ошибка при создании Таблицы");
//        }
    }

    public void dropUsersTable() {
//        try (Statement statement = connect.createStatement()) {
//            statement.executeUpdate("DROP TABLE IF EXISTS users");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    public void saveUser(String name, String lastName, byte age) {
//        try (PreparedStatement preparedStatement = connect.prepareStatement("INSERT INTO users (name,last_name,age) VALUES (?,?,?)")) {
//            {
//                preparedStatement.setString(1, name);
//                preparedStatement.setString(2, lastName);
//                preparedStatement.setByte(3, age);
//                preparedStatement.executeUpdate();
//                System.out.println("Сохранен");
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    public void removeUserById(long id) {
//        try (PreparedStatement preparedStatement = connect.prepareStatement("DELETE FROM users WHERE id = ?")) {
//            preparedStatement.setLong(1, id);
//            preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    public List<User> getAllUsers() {
//        List<User> users = new ArrayList<>();
//        try (ResultSet resultSet = connect.createStatement().executeQuery("SELECT  * FROM users")) {
//            while (resultSet.next()) {
//                User user = new User(resultSet.getString("name"), resultSet.getString("last_name"), resultSet.getByte("age"));
//                user.setId(resultSet.getLong("id"));
//                users.add(user);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return users;
        return null;
    }

    public void cleanUsersTable() {
//        try (Statement statement = connect.createStatement()) {
//            statement.executeUpdate("TRUNCATE TABLE users");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
    }
}
