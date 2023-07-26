package com.springexample.restdemo.rep;

import com.springexample.restdemo.Structure;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Structure,String> {
}
