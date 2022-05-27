package com.group2.com.group_proyect.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "customer")
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "dni", length = 8, nullable = false)
    private String dni;

    @Column(name = "first_name", length = 30, nullable = false)
    private String firstName;

    @Column(name = "last_name", length = 30, nullable = false)
    private String lastName;

    @Column(name = "address", length = 30, nullable = false)
    private String address;

    @Column(name = "date_birth", nullable = false)
    private Date dateOfBirth;

    @Column(name = "email", length = 30, nullable = false)
    private String email;

    @Column(name = "phone", length = 9, nullable = false)
    private String phone;
}
