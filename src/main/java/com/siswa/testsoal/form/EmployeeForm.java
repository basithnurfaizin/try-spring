package com.siswa.testsoal.form;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.siswa.testsoal.model.Employee;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;


@Getter
@Setter
public class EmployeeForm implements EntityForm<Employee> {

    private String name;

   private String address;

    @Override
    public Employee toCreateEntity() {
        Employee employee = new Employee();
        BeanUtils.copyProperties(this, employee);
        return employee;
    }

    @Override
    public Employee toUpdateEntity(Employee oldEntity) {
        return null;
    }
}
