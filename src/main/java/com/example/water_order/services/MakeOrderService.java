package com.example.water_order.services;

import com.example.water_order.employees.model.Employee;
import com.example.water_order.orders.model.Order;
import com.example.water_order.orders.model.OrderState;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Primary
public class MakeOrderService implements OrderService {

    private List<Order> orders = new ArrayList<>();

    public MakeOrderService () {
        init();
    }


    @Override
    public List<Order> getAllOrders() {
        return null;
    }

    @Override
    public void saveOrder(String productName, Employee employee, OrderState state) {

    }

    void init() {
        orders.add(new Order());
    }
}
