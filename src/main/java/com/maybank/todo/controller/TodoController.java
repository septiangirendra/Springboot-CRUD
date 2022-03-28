package com.maybank.todo.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.maybank.todo.entity.Todo;
import com.maybank.todo.service.TodoService;

@Controller
@RequestMapping("/todo")
public class TodoController {
	
	@Autowired
	TodoService todoService; 
	
	@InitBinder
    public void initBinder(WebDataBinder binder) {
        // Date - dd/MM/yyyy
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }
	
	@GetMapping("/list-all")
	public String listAll(Model model) {
		model.addAttribute("todos", todoService.listAll()); 
		return "/todo/listAll"; 
	}
	
	@GetMapping("/add")
	public String add(Model model) {
		model.addAttribute("todo", new Todo());
		return "/todo/add"; 
	}
	
	@RequestMapping(value="/edit/{id}", method = RequestMethod.GET)
	public String edit(Model model, @PathVariable int id) {
		Optional <Todo> todo = todoService.getTodoById(id);
		model.addAttribute("todo", todo); 
		return "/todo/edit";
	}
	
	@RequestMapping(value="/save", method = RequestMethod.POST)
	public String save(@ModelAttribute Todo todo) {
		todoService.save(todo); 
		return "redirect:/todo/list-all"; 
	}
	
	@RequestMapping(value="/update", method = RequestMethod.POST)
	public String update(@ModelAttribute Todo todo) {
		todoService.update(todo); 
		return "redirect:/todo/list-all"; 
	}
	
	@RequestMapping(value="/delete/{id}", method = RequestMethod.GET) 
	public String delete(@PathVariable int id) {
		todoService.delete(id); 
		return "redirect:/todo/list-all"; 
	}
	
	
}
