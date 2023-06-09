package com.app.resource;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.app.model.Todo;
import com.app.service.TodoService;

@RestController
public class TodoRestController {
	
	@Autowired
	TodoService service;

	@RequestMapping(value = "/todos")
	public List<Todo> retrieveAllTodos() {
		return service.retrieveTodos("in28Minutes");
	}

	@RequestMapping(value = "/todos/{id}")
	public Todo retrieveTodo(@PathVariable int id) {
		return service.retrieveTodo(id);
	}

}
