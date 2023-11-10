package com.example.water_order.orders.service;

import com.example.water_order.employees.model.Employee;
import com.example.water_order.orders.dto.FullOrderDto;
import com.example.water_order.orders.model.Order;
import com.example.water_order.orders.model.OrderState;

import java.util.List;

public interface OrderService {

    FullOrderDto getById(Long id);
}
