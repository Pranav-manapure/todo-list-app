package com.todoListDemo.todo.controller;



import com.todoListDemo.todo.model.Todo;
import com.todoListDemo.todo.repository.TodoRepository;
import com.todoListDemo.todo.service.TodoService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/todos")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @Autowired
    private TodoRepository todoRepository;

    @GetMapping("/findAll")
    public List<Todo> getAllTodos() {
        return todoService.findAllTodos();
    }

    @GetMapping("/csrfToken")
    public CsrfToken getCsrfToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @PostMapping
    public Todo createTodo(@RequestBody Todo todo) {
        return todoService.createTodo(todo);
    }

    @DeleteMapping("delete/{id}")
    public void deleteTodoById(@PathVariable Long id) {
        System.out.println(id+ " Deleted");
        todoService.deleteTodoById(id);
    }

    @PutMapping("/complete/{id}")
    public Todo markAsCompleted(@PathVariable Long id) {
        return todoService.markAsCompleted(id);
    }

    @PutMapping("/UpdateAll/{id}")
    public Todo updateTodo(@PathVariable Long id, @RequestBody Todo todoDetails) {
        Todo todo = todoRepository.findById(id).orElseThrow(() -> new RuntimeException("Todo not found"));
        todo.setTask(todoDetails.getTask());
        todo.setCompleted(todoDetails.isCompleted());
        todo.setPriority(todoDetails.getPriority());  // Update priority
        return todoRepository.save(todo);
    }

}
