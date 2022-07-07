package com.example.webtutorials01.Domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "categories")
@AllArgsConstructor
@NoArgsConstructor
public class Category implements Serializable {

    @Id
    private String Id;

    @Column(name = "Name")
    private String Name;

    @OneToMany(mappedBy = "category")
    List<Product> products;
}
