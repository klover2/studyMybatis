package com.klover.entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private int id;
    private String name;
    private int age;
    private Date time;
}
