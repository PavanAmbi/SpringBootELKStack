package com.practice.springbootelasticlogstashkibana.exception;

public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(String mesage){
        super(mesage);
    }
}
