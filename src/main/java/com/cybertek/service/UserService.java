package com.cybertek.service;

import com.cybertek.dto.UserDTO;

import java.util.List;

public interface UserService extends CrudService<UserDTO,String> {

    //save user
    //find user buy user name
    //to update first we need to find one
    //give me all user list
    //delete records
    // SERVICE is all about business logic = C R U D etc

   /*  We will do them all by crud service. We just extend to CrudService
    UserDTO save(UserDTO);
    UserDTO finByID(String username);
    List<UserDTO> findAll();
    void delete(UserDTO user);
    void deleteByID(String userName);
    */
    List<UserDTO> findManagers();
    List<UserDTO> findEmployees();
}
