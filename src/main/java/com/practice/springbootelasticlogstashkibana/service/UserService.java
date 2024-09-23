package com.practice.springbootelasticlogstashkibana.service;

import com.practice.springbootelasticlogstashkibana.exception.UserNotFoundException;
import com.practice.springbootelasticlogstashkibana.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    Logger logger = LoggerFactory.getLogger(UserService.class);
    List<User> users = new ArrayList<>(Arrays.asList(new User("adas",33,10),
            new User("jnk",31,76),
            new User("dcdg",29,9)));

    public User findUser(int id){
        User user = users.stream().filter(entity -> entity.getId()==id).findFirst().
                orElse(null);
        if(user == null){
            throw new UserNotFoundException("User Not found for Id " + id);
        }
        logger.info("User Found {} " , user);
        return user;
    }
}


