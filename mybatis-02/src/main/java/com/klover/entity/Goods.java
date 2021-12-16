package com.klover.entity;

import lombok.Data;

@Data
public class Goods {
    private int id;
    private String name;
    private float amount;
    private int userId;
    private User user;
}
