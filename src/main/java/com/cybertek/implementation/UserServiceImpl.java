package com.cybertek.implementation;

import com.cybertek.dto.UserDTO;
import com.cybertek.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service  //we need to create a bean  to be able to us in DataGenerator.
public class UserServiceImpl extends AbstractMapService<UserDTO,String> implements UserService { //change the Generics to UserDTO

    //call methods from parent  Interface  and implement them
    @Override
    public List<UserDTO> findAll() {

        return super.findAll(); // return null ?
    }

    @Override
    public UserDTO save(UserDTO object) {
        return super.save(object.getUserName(),object);
    }

    @Override
    public void update(UserDTO object) {

        super.update(object.getUserName(),object); //after making changes in AbstractMapService update accordingly with super
    }

    @Override
    public void deleteById(String id) {
        super.deleteById(id);
    }

    @Override
    public void delete(UserDTO object) {
        super.delete(object);
    }//change the Generics to UserDTO

    @Override
    public UserDTO findById(String id) {
        return super.findById(id);
    }

    @Override
    public List<UserDTO> findManagers() {
        return super.findAll().stream().filter(user -> user.getRole().getId() == 2).collect(Collectors.toList());
    }

    @Override
    public List<UserDTO> findEmployees() {
        return super.findAll().stream().filter(user -> user.getRole().getId() == 3).collect(Collectors.toList());
    }
}
