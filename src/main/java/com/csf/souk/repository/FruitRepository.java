package com.csf.souk.repository;


import org.springframework.data.repository.CrudRepository;

import com.csf.souk.model.Fruit;

//repository that extends CrudRepository  
public interface  FruitRepository extends CrudRepository<Fruit, Integer>  
{  
}  
