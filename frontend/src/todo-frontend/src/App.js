import { useEffect, useState } from 'react';
import todoService from './api/todoService';
import TodoList from './components/TodoList';
import AddTodo from './components/AddTodo';
import './App.css'; // Custom CSS file for additional styling

// rum: npm start
// dir: todo-frontend> npm start

const App = () => {
  const [todos, setTodos] = useState([]);

  useEffect(() => {
    loadTodos();
  }, []);

  const loadTodos = async () => {
    const response = await todoService.getTodos();
    setTodos(response.data);
  };

  const addTodo = async (todo) => {
    await todoService.addTodo(todo);
    loadTodos();
  };

  const completeTodo = async (id) => {
    await todoService.completeTodo(id);
    loadTodos();
  };

  const deleteTodo = async (id) => {
    await todoService.deleteTodo(id);
    loadTodos();
  };

  return (
    <div className="App container mt-5">
      <h1 className="text-center mb-4">Todo List</h1>
      <div className="row">
        <div className="col-md-6 offset-md-3">
          <AddTodo addTodo={addTodo} />
          <TodoList todos={todos} completeTodo={completeTodo} deleteTodo={deleteTodo} />
        </div>
      </div>
    </div>
  );
};

export default App;
