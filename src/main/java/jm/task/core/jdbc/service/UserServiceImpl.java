package jm.task.core.jdbc.service;


import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

public class UserServiceImpl implements UserService {
    UserDao dao = new UserDaoJDBCImpl();

    public void createUsersTable() {
        try {
            dao.createUsersTable();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void dropUsersTable() {
        try {
            dao.dropUsersTable();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void saveUser(String name, String lastName, byte age) {
        try {
            dao.saveUser(name, lastName, age);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void removeUserById(long id) {
        try {
            dao.removeUserById(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<User> getAllUsers() {
        try {
            return dao.getAllUsers();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    public void cleanUsersTable() {
        try {
            dao.cleanUsersTable();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
