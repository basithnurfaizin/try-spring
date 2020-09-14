package com.siswa.testsoal.service;

import com.siswa.testsoal.form.EntityForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * created by nurfaizin
 * This class used as a shortcut for many service that has generic list, get, save, update and delete methods
 *
 * @param <T> entity class
 * @param <ID> entity's id
 * @param <FORM> entity's crud form
 */
public interface BaseService<T, ID, FORM extends EntityForm<T>> {

    Page<T> list(Pageable pageable);

    Page<T> search(Pageable pageable, Object... filters);

    T get(ID id);

    T create(FORM form);

    T update(ID id, FORM form);

    void delete(ID id);
}
