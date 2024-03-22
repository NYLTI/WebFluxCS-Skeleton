package com.repo;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.model.Student;

import reactor.core.publisher.Flux;

@Repository
public interface StudentReactiveRepository{
}
