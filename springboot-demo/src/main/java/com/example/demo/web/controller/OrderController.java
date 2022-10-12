package com.example.demo.web.controller;

import com.example.demo.web.entity.Order;
import com.example.demo.web.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wangkai
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("/{id}")
    public List<Order> getById(@PathVariable String id) {
        return this.orderService.getById(id);
    }
}