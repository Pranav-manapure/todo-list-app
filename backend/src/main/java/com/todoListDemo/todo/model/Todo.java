package com.todoListDemo.todo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String task;

    private boolean completed = false;
    // Add a new field for task priority
    private String priority;  // High, Medium, Low


    // Default constructor
    public Todo() {}

    // Constructor for initialization


    public Todo(String task, boolean completed, String priority) {
        this.task = task;
        this.completed = completed;
        this.priority = priority;
    }

    public Todo(Long id, String task, boolean completed, String priority) {
        this.id = id;
        this.task = task;
        this.completed = completed;
        this.priority = priority;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", task='" + task + '\'' +
                ", completed=" + completed +
                ", priority='" + priority + '\'' +
                '}';
    }
}
