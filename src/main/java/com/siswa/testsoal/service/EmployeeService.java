package com.siswa.testsoal.service;

import com.siswa.testsoal.model.Employee;

public interface EmployeeService extends BaseService {
    Employee getByName(String name);

    Employee getByAddress(String address);
}
