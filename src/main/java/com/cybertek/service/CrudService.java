package com.cybertek.service;

import java.util.List;

public interface CrudService<T,ID> {

    List<T> findAll();  //add (T, ID) parameter to eliminate error. When we start using them in user or role just change them to (RoleDTO, Long)
    T findById(ID id);
    void delete(T object);
    void deleteById(ID id);
    T save(T object);
    void update(T object);

}
