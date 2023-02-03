package com.aboutme.api.security.service;

import com.aboutme.api.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@Import(UserRepository.class)
@ExtendWith(SpringExtension.class)
@WebMvcTest({UserRepository.class})
@AutoConfigureMockMvc(addFilters = false)
public class UserDetailsServiceImplTest {

    @Autowired
    private UserDetailsServiceImpl userDetailsService; //= mock(UserDetailsServiceImpl.class);


    @Test
    public void shouldReturnUserDetails_onGet() {
        //when
        UserDetails users = userDetailsService.loadUserByUsername("test");
        Assertions.assertNotEquals(null, users);
    }
}
