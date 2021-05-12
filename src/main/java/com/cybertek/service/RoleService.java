package com.cybertek.service;

import com.cybertek.dto.RoleDTO;
import com.cybertek.dto.UserDTO;

import java.util.List;

public interface RoleService extends CrudService<RoleDTO,Long> {

/*  We will do them all
    RoleDTO save(UserDTO);
    RoleDTO finByID(String username);
    List<RoleDTO> findAll();
    void delete(RoleDTO user);
    void deleteByID(Long id);
    */

    /*
    Generic has 2 parameters
    T save(T role);
    T finByID(ID id);
    List<T> findAll();
    void delete(T role);
    void deleteByID(Long id);
     */

}
