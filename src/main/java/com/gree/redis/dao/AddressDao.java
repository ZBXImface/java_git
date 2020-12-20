package com.gree.redis.dao;

import com.gree.redis.entity.Address;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AddressDao {
    List<Address> getAddress();
    Integer getUserId(String userName);
}
