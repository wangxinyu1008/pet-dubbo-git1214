package com.kgc.dubbo077.petprovider.service;

import com.kgc.dubbo077.petapi.pojo.Pet;
import com.kgc.dubbo077.petapi.pojo.PetExample;
import com.kgc.dubbo077.petapi.service.SelectService;
import com.kgc.dubbo077.petprovider.mapper.PetMapper;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
@Service
@Component
public class SelectServiceImpl implements SelectService {
    @Resource
    PetMapper petMapper;
    @Override
    public List<Pet> selectAll(String bread) {
        PetExample petExample=new PetExample();
        List<Pet> pets;
        if(bread!=null) {
            petExample.createCriteria().andPetBreadEqualTo(bread);
            pets = petMapper.selectByExample(petExample);
        }else{
            pets = petMapper.selectByExample(null);
        }
        return pets;
    }

    @Override
    public int add(Pet pet) {
        int i = petMapper.insertSelective(pet);
        return i;
    }

    @Override
    public int delete(Integer petId) {
        return petMapper.deleteByPrimaryKey(petId);
    }
}
