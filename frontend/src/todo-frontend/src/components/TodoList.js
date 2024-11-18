import React from 'react';

const TodoList = ({ todos, completeTodo, deleteTodo }) => {
  return (
    <div className="container">
      <ul className="list-group">
        {todos.map(todo => (
          <li key={todo.id} className="list-group-item d-flex justify-content-between align-items-center">
            <div>
              <h5>{todo.task}</h5>
              <p>Priority: <strong>{todo.priority}</strong></p>  {/* Display priority */}
              {todo.completed ? <span className="badge bg-success">Completed</span> : <span className="badge bg-warning">Pending</span>}
            </div>
            <div>
              <button className="btn btn-sm btn-primary me-2" onClick={() => completeTodo(todo.id)}>
                Mark as Completed
              </button>
              <button className="btn btn-sm btn-danger" onClick={() => deleteTodo(todo.id)}>
                Delete
              </button>
            </div>
          </li>
        ))}
      </ul>
    </div>
  );
};

export default TodoList;
