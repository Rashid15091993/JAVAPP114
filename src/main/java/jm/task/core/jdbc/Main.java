package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private final static UserService userService = new UserServiceImpl();

    public static void main(String[] args) {
        userService.createUsersTable();

        userService.saveUser("Джордж", "Иванов", (byte) 78);
        userService.saveUser("Олег", "Шнак", (byte) 74);
        userService.saveUser("Коля", "Моисеев", (byte) 59);
        userService.saveUser("Андрей", "Бур", (byte) 74);

        userService.removeUserById(2);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
