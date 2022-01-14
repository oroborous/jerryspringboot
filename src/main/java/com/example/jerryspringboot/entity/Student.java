package com.example.jerryspringboot.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "student_id", nullable = false)
    private Integer id;

    @Column(name = "first_nm", nullable = false)
    private String firstName;

    @Column(name = "last_nm", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false)
    private String email;

}
