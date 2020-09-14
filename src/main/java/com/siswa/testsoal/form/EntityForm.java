package com.siswa.testsoal.form;

public interface EntityForm<T> {

    T toCreateEntity();

    T toUpdateEntity(T oldEntity);
}
