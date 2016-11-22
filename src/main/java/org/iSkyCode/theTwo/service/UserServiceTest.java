package org.iSkyCode.theTwo.service;

import org.iSkyCode.helper.DatabaseHelper;
import org.iSkyCode.theTwo.model.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/**
 * Created by phoenix on 2016/11/20.
 */
public class UserServiceTest {

    private UserService userService;

    public UserServiceTest() {
        userService = new UserService();
    }

    @Before
    public void init() {

    }

    @After
    public void complete() {

    }

    @Test
    public void getUserList() throws Exception {
        List<User> userList = userService.getUserList();
        Connection connection = DatabaseHelper.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT  count(1) FROM USER ");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getInt(1));
        }
        DatabaseHelper.closeConnection(connection);
    }

    @Test
    public void getUser() throws Exception {

    }

    @Test
    public void createUser() throws Exception {

    }

    @Test
    public void updateUser() throws Exception {

    }

    @Test
    public void deleteUser() throws Exception {

    }

}