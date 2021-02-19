package ru.itis.springbootdemo.dto;

import lombok.Data;

import javax.xml.soap.SAAJResult;

@Data
public class UserForm {
    private String name;
    private String surname;
    private String email;
    private String password;
}
