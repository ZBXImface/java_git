package com.gree.redis.entity;

import lombok.Data;

@Data
public class Address {
    private Integer id;
    private String name;
    private String phone;
    private String addDetail;
    private Integer isDefault;
    private Integer userId;
    private Integer status;
}
