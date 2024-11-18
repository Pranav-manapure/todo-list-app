import axios from 'axios';

const API_URL = 'http://localhost:8080/api/todos';

// Get all todos
const getTodos = () => axios.get(`${API_URL}/findAll`);

// Add new todo
const addTodo = (todo) => axios.post(API_URL, todo);

// Mark todo as completed
const completeTodo = (id) => axios.put(`${API_URL}/complete/${id}`);

// Update todo
const updateTodo = (id, updatedTodo) => axios.put(`${API_URL}/UpdateAll/${id}`, updatedTodo);

// Delete todo
const deleteTodo = (id) => axios.delete(`${API_URL}/delete/${id}`);

// Define all the API functions here
const todoService = {
    getTodos,
    addTodo,
    completeTodo,
    updateTodo,
    deleteTodo,
};

// Export the object
export default todoService;

