package com.aboutme.api.service;

import com.aboutme.api.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.mockito.Mockito.mock;

public class UserServiceTest {
    private UserService userService = mock(UserService.class);

    @Test
    public void shouldReturnAUsers_onGet() {
        //when
        List<User> users = userService.findAll();
        Assertions.assertNotEquals(null, users);
    }
}
