package com.example.water_order.orders.dto;

import com.example.water_order.orders.model.Order;
import lombok.experimental.UtilityClass;

@UtilityClass
public class OrderMapper {

    public static FullOrderDto getFullOrderDto(Order order) {
        return FullOrderDto.builder()
                .id(order.getId())
                .productName(order.getProductName())
                .createdOn(order.getCreatedOn())
                .address(order.getAddress())
                .comment(order.getComment())
                .state(order.getState())
                .build();
    }
}
