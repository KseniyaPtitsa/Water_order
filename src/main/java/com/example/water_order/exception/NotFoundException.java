package com.example.water_order.exception;

public class NotFoundException extends RuntimeException {


    public NotFoundException() {
    }

    public NotFoundException(String message) {
        super(message);
    }
}
