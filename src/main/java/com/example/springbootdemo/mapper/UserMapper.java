package com.example.springbootdemo.mapper;

import com.example.springbootdemo.dto.FacBuyer;

import java.util.List;

public interface UserMapper {
    List<FacBuyer> selectBuyers();
}
