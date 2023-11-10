package com.example.water_order.products;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "volume")
    private double volume;

    @Column(name = "avail_quantity")
    private int avail_quantity;

    public Products (String name, double volume, int avail_quantity) {
        this.name = name;
        this.volume = volume;
        this.avail_quantity = avail_quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getAvail_quantity() {
        return avail_quantity;
    }

    public void setAvail_quantity(int avail_quantity) {
        this.avail_quantity = avail_quantity;
    }

}
