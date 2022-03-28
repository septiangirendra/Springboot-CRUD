package com.maybank.todo.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.maybank.todo.entity.Todo;

public interface TodoService {
	List<Todo> listAll ();  
	Optional <Todo> getTodoById(int id);
    void add(String name, String description, Date targetDate, int starMeter);
    void delete(int id);
    void save(Todo todo);
    void update(Todo todo);
}
