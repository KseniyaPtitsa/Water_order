package com.example.water_order.orders.service;

import com.example.water_order.exception.NotFoundException;
import com.example.water_order.orders.dto.FullOrderDto;
import com.example.water_order.orders.dto.OrderMapper;
import com.example.water_order.orders.model.Order;
import com.example.water_order.orders.storage.OrderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Override
    public FullOrderDto getById(Long id) {
        log.info("OrderServiceImpl: получение данных заказа с id: {}", id);

        Order orderFromDb = orderRepository.findById(id).orElseThrow(() -> new NotFoundException("Order with id: " + id + " not found"));
        return OrderMapper.getFullOrderDto(orderFromDb);
    }
}
