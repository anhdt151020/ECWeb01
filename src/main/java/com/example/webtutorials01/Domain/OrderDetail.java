package com.example.webtutorials01.Domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "OrderDetails",uniqueConstraints = {
        @UniqueConstraint(columnNames = {"OrderId","ProductId"})})
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetail implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private double Price;
    private Integer Quantity;

    @ManyToOne
    @JoinColumn(name = "ProductId")
    Product product;

    @ManyToOne
    @JoinColumn(name = "OrderId")
    Order order;
}
