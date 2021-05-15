package com.cybertek.implementation;

import com.cybertek.dto.RoleDTO;
import com.cybertek.dto.UserDTO;
import com.cybertek.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service  //we need to create a bean to be able to us in DataGenerator.
public class RoleServiceImpl extends AbstractMapService<RoleDTO,Long> implements RoleService { //first add imnplements

    //call methods from parent  Interface  and implement them
    @Override
    public List<RoleDTO> findAll() {
        return super.findAll();
    } //change the Generics to RoleDTO

    @Override
    public RoleDTO save(RoleDTO object) {
        return super.save(object.getId(),object);
    }//change the Generics to RoleDTO

    @Override
    public void update(RoleDTO object) {
        super.update(object.getId(),object);
    }//change the Generics to RoleDTO
    //after making changes in AbstractMapService update accordingly with super


    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(RoleDTO object) {
        super.delete(object);
    }//change the Generics to RoleDTO

    @Override
    public RoleDTO findById(Long id) {
        return super.findById(id);
    } //change the String to Long
}
