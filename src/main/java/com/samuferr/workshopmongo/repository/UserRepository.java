package com.samuferr.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.samuferr.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
