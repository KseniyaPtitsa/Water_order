package com.example.water_order.controllers;

import com.example.water_order.orders.model.Order;
import com.example.water_order.services.MakeOrderService;
import com.example.water_order.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController (OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/allOrders")
    @ResponseBody
    public List<Order> getOrders() {
        return orderService.getAllOrders();
    }
}
