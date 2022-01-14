package com.example.jerryspringboot.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "course_id", nullable = false)
    private Integer id;

    @Column(name = "dept_id", nullable = false)
    private Integer departmentId;

    @Column(name = "course_num", nullable = false)
    private Integer courseNumber;

    @Column(name = "course_nm", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

}
