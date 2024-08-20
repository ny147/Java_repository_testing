package com.example.liquibase.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "departments")
@Data
public class Department {

    private long id;
    @Column
    private  String departmentName;
    private  String location;


    @OneToMany(mappedBy = "department")
    private List<Employee>  employees;

}
