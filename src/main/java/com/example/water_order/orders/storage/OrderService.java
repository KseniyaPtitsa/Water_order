package com.example.water_order.orders.storage;

import com.example.water_order.employees.model.Employee;
import com.example.water_order.orders.model.Order;
import com.example.water_order.orders.model.OrderState;

import java.util.List;

public interface OrderService {

    List<Order> getAllOrders();

    void saveOrder (String productName, Employee employee, OrderState state);
}
