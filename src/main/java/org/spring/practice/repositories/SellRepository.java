package org.spring.practice.repositories;

import org.spring.practice.model.Sell;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellRepository extends CrudRepository<Sell, Long>{
    
}
