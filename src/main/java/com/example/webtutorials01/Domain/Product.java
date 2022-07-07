package com.example.webtutorials01.Domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "Products")
@AllArgsConstructor
@NoArgsConstructor
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String Id;

    @Column(name = "Name")
    private String Name;

    @Column(name = "Image")
    private String Image;

    @Column(name = "Price")
    private Double Price;

    @Column(name = "Quantity")
    private Integer Quantity;

    @Column(name = "Create_Date")
    private Date CreateDate;


    @Column(name = "Available")
    private Boolean Available;

    @ManyToOne
    @JoinColumn(name = "CategoryId")
    Category category;
}
