package com.client;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.entity.User;

@Service
public class UserServiceClient {
    @Autowired
    private RestTemplate restTemplate;

    public User getUserById(Long id) {
        return restTemplate.getForObject("http://user-service/users/" + id, User.class);
    }
}
