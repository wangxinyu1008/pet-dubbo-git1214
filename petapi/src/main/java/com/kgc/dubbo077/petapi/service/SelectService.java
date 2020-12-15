package com.kgc.dubbo077.petapi.service;

import com.kgc.dubbo077.petapi.pojo.Pet;

import java.util.List;

public interface SelectService {
    List<Pet> selectAll(String bread);
    int add(Pet pet);
}
