package com.aboutme.api.security.service;

import com.aboutme.api.security.model.UserDetailsImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
public class UserDetailsServiceImplTest {

    @MockBean
    UserDetailsServiceImpl userDetailsServiceImpl;


    @Test
    public void shouldReturnUserDetails_onGet() {
        UserDetails userDetails = new UserDetailsImpl("1","test@test.com","1234", "test");
        Mockito.when(userDetailsServiceImpl.loadUserByUsername("test")).thenReturn(userDetails);
    }

    @Test
    public void shouldReturnNul_onGet() {
        Mockito.when(userDetailsServiceImpl.loadUserByUsername("test")).thenReturn(null);
    }
}
