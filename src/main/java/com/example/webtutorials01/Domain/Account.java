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
    private String UserName;

    private String FullName;

    private String Password;

    private String Email;

    private String Photo;

    private Boolean Activated;

    private Boolean Admin;

}
