const TodoItem = ({ todo, completeTodo, deleteTodo }) => {
    return (
      <div className="todo-item">
        <p style={{ textDecoration: todo.completed ? 'line-through' : 'none' }}>
          {todo.task} - <strong>{todo.priority}</strong>
        </p>
        <button onClick={() => completeTodo(todo.id)}>Complete</button>
        <button onClick={() => deleteTodo(todo.id)}>Delete</button>
      </div>
    );
  };
  
  export default TodoItem;
  