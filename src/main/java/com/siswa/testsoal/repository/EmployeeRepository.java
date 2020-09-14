package com.siswa.testsoal.repository;

import com.siswa.testsoal.model.Employee;

public interface EmployeeRepository extends BaseRepository<Employee, Long> {

    Employee findByAddress(String address);

}
