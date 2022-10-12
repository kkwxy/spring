package com.example.demo.web.dao;

import com.example.demo.web.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface OrderDao {

    List<Order> getId(String id);

}