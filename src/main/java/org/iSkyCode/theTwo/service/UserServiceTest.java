package org.iSkyCode.theTwo.service;

import org.iSkyCode.theTwo.model.User;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

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

    @org.junit.Test
    public void getUserList() throws Exception {
        List<User> userList = userService.getUserList();
        Assert.assertEquals(0, userList.size());
    }

    @org.junit.Test
    public void getUser() throws Exception {

    }

    @org.junit.Test
    public void createUser() throws Exception {

    }

    @org.junit.Test
    public void updateUser() throws Exception {

    }

    @org.junit.Test
    public void deleteUser() throws Exception {

    }

}