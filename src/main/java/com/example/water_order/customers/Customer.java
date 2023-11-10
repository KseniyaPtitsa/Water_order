package com.example.water_order.customers;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Long id;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "first_name")
    private String fistName;

    @Column(name = "telephone")
    private int telephone;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public Customer(String lastName, String fistName, int telephone) {
        this.lastName = lastName;
        this.fistName = fistName;
        this.telephone = telephone;
    }

    public Customer(String fistName, int telephone) {
        this.fistName = fistName;
        this.telephone = telephone;
    }


}
