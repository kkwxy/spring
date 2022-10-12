package com.example.demo.web.service;

import com.example.demo.web.dao.OrderDao;
import com.example.demo.web.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (Order)表服务接口
 *
 * @author
 * @since 2021-12-14 10:53:05
 */
@Service
public class OrderService {

    @Autowired
    private OrderDao orderDao;

    public List<Order> getById(String id) {
        return orderDao.getId(id);
    }

}