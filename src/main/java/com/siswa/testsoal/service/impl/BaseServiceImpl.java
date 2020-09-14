package com.siswa.testsoal.service.impl;

import com.siswa.testsoal.form.EntityForm;
import com.siswa.testsoal.repository.BaseRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

public abstract class BaseServiceImpl<T, ID, FORM extends EntityForm<T>, R extends BaseRepository<T,ID>> {

    protected R repository;

    public Page<T> list(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public Page<T> search(Pageable pageable, Object... filters) {
        return repository.findAll(getSearchFilter(filters), pageable);
    }

    public T get(ID id) {
        return repository.findById(id).get();
    }

    public T create(FORM form) {
        T t = form.toCreateEntity();
        t = repository.save(t);
        return t;
    }

    public T update(ID id, FORM form) {
        T t = get(id);
        form.toUpdateEntity(t);
        repository.save(t);
        return t;
    }

    public void delete(ID id) {
        repository.deleteById(id);
    }


    public abstract Specification<T> getSearchFilter(Object... filters);
}
