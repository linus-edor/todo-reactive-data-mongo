package com.boot.todo.reactive.data.mongo.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.boot.todo.reactive.data.mongo.model.ToDo;

@Repository
public interface ToDoRepository extends ReactiveMongoRepository<ToDo, String> {}