package com.example.webtutorials01.Domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@Table(name = "Accounts")
@AllArgsConstructor
@NoArgsConstructor
public class Account implements Serializable {

    @Id
    private String userName;

    private String fullName;

    private String password;

    private String email;

    private String photo;

    private Boolean activated;

    private Boolean admin;

}
