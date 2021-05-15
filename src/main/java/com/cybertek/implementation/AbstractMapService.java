package com.cybertek.implementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractMapService<T,ID> { //We use MAP logic key and values

    protected Map<ID,T> map = new HashMap<>();  //will contain unique identifiers

    T save(ID id,T object){  // object
        map.put(id,object);
        return object;
    }

    List<T> findAll(){

        return new ArrayList<>(map.values());
    }

    T findById(ID id){

        return map.get(id);
    }

    void deleteById(ID id){

        map.remove(id);
    }

    void delete(T object){

        map.entrySet().removeIf(entry -> entry.getValue().equals(object));  //convert map to Stream by using entrySet
    }

    void update(ID id,T object){
        //before update, go to related object
        //delete the related object
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
        //add teh new updated object
        map.put(id,object);
    }








}
