package com.example.water_order.orders.dto;


import com.example.water_order.orders.model.OrderState;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FullOrderDto {

    private Long id;

    private String productName;

    private LocalDateTime createdOn;

    private String address;

    private String comment;

    private OrderState state;
}
