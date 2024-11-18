package com.todoListDemo.todo;

import com.todoListDemo.todo.model.Todo;
import com.todoListDemo.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class TodoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

	@Component
	public static class DataInitializer implements CommandLineRunner {

		@Autowired
		private TodoRepository todoRepository;

		@Override
		public void run(String... args) throws Exception {
			// Create and save default Todo entries
			todoRepository.save(new Todo("Complete Spring Boot project", false,"High"));
			todoRepository.save(new Todo("Review Java basics", false,"Medium"));
			todoRepository.save(new Todo("Prepare for upcoming interview", false,"Low"));

			System.out.println("Default todos added to the database.");
		}
	}
}
