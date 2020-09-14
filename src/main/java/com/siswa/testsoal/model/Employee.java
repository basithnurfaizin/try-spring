package com.siswa.testsoal.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="employee")
public class Employee {

    @Id
    private Long id;

    private String address;
}
