package com.rt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rt.entity.Borrower;

@Repository
public interface BorrowerRepository extends CrudRepository<Borrower, Integer> {

}
