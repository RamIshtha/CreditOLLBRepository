package com.rt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rt.entity.Lender;

@Repository
public interface LenderRepository extends CrudRepository<Lender, Integer> {

}
