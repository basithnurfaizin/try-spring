package com.siswa.testsoal.service.impl;

import com.siswa.testsoal.form.EmployeeForm;
import com.siswa.testsoal.form.EntityForm;
import com.siswa.testsoal.model.Employee;
import com.siswa.testsoal.repository.EmployeeRepository;
import com.siswa.testsoal.service.EmployeeService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

public class EmployeeServiceImpl  extends BaseServiceImpl<Employee, Long, EmployeeForm, EmployeeRepository>
        implements EmployeeService {

    @Override
    public Employee getByName(String name) {
        return null;
    }

    @Override
    public Employee getByAddress(String address) {
        return null;
    }

    @Override
    public Employee save(Employee user) {
        return repository.save(user);
    }

    @Override
    public Page<Employee> list(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public Page<Employee> search(Pageable pageable, Object... filters) {
        return null;
    }

    @Override
    public Employee get(Long aLong) {
        return repository.findById(aLong).get();
    }

    @Override
    public Employee create(EntityForm form) {
        Employee usr = form.toCreateEntity();
        return usr;
    }

    @Override
    public Employee update(Long aLong, EmployeeForm form) {
        Employee usr = get(aLong);
        form.toUpdateEntity(usr);
        repository.save(usr);
        return usr;
    }

    @Override
    public void delete(Long aLong) {
        repository.deleteById(aLong);
    }

    @Override
    public Specification<User> getSearchFilter(Object... filters) {
        return null;
    }
}
