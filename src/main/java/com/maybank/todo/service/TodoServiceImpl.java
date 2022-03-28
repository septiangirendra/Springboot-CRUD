package com.maybank.todo.service;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maybank.todo.entity.Todo;
import com.maybank.todo.entity.TodoRepository;


@Service
public class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoRepository repo;

    @Override
	public List<Todo> listAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

    @Override
    public Optional < Todo > getTodoById(int id) {
        return repo.findById(id);
    }

    @Override
    public void update(Todo todo) {
        repo.save(todo);
    }

    @Override
    public void delete(int id) {
        Optional < Todo > todo = repo.findById(id);
        if (todo.isPresent()) {
            repo.delete(todo.get());
        }
    }

    @Override
    public void save(Todo todo) {
        repo.save(todo);
    }

	@Override
	public void add(String name, String description, Date targetDate, int starMeter) {
		// TODO Auto-generated method stub
		repo.save(new Todo(name, description, targetDate, starMeter)); 
		
	}
}