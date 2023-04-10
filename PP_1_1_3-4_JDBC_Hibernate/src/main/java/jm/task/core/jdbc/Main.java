package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Мадс", "Миккельсен", (byte) 57);
        userService.saveUser("Норман", "Ридус", (byte) 54);
        userService.saveUser("Томми", "Флэнаган", (byte) 57);
        userService.saveUser("Рон", "Перлман", (byte) 72);

        userService.removeUserById(3);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
