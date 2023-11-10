package com.example.water_order.orders.controller;

import com.example.water_order.orders.dto.FullOrderDto;
import com.example.water_order.orders.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/order")
@RequiredArgsConstructor(onConstructor_ = @Autowired)
@Slf4j
public class OrderController {

    private final OrderService orderService;

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public FullOrderDto getById(
            @PathVariable Long id
    ) {
        log.info("OrderController: получение данных заказа с id: {}", id);
        return orderService.getById(id);
    }


}
