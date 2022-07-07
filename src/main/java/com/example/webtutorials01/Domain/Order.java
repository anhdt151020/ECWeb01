package com.example.webtutorials01.Domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "Orders")
@AllArgsConstructor
@NoArgsConstructor
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String Id;

    private String address;

    @Temporal(TemporalType.DATE)
    @Column(name = "CreateDate")
    private Date createDate = new Date();

    @ManyToOne
            @JoinColumn(name = "UserName")
    Account account;

    @OneToMany(mappedBy = "order")
    List<OrderDetail> orderDetails;
}
