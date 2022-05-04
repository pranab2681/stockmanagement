package com.paav.StockManagement.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="product_name")
    private String name;
    @Column(name="product_manufacturer")
    private String manufacturer;
    @Column(name = "product_rate")
    private float rate;
    private String hsn;
    private String batch;
    @Column(name = "expiry_date")
    @DateTimeFormat(pattern = "MM-dd-yyyy")
    private Date expiry;
    @Column(name = "add_date")
    @DateTimeFormat(pattern = "MM-dd-yyyy")
    private Date add;
    @Column(name = "created_by")
    private Timestamp created;
}
