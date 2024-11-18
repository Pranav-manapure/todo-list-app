import React, { useState } from 'react';

const AddTodo = ({ addTodo }) => {
  const [task, setTask] = useState('');
  const [priority, setPriority] = useState('Medium');

  const handleSubmit = (e) => {
    e.preventDefault();
    if (task.trim()) {
      addTodo({
        task,
        completed: false,
        priority
      });
      setTask('');
    }
  };

  return (
    <form onSubmit={handleSubmit} className="mb-3">
      <div className="form-group">
        <label htmlFor="task">Task</label>
        <input
          type="text"
          className="form-control"
          id="task"
          value={task}
          onChange={(e) => setTask(e.target.value)}
        />
      </div>
      <div className="form-group">
        <label htmlFor="priority">Priority</label>
        <select
          className="form-control"
          id="priority"
          value={priority}
          onChange={(e) => setPriority(e.target.value)}
        >
          <option>High</option>
          <option>Medium</option>
          <option>Low</option>
        </select>
      </div>
      <button type="submit" className="btn btn-primary mt-2">Add Task</button>
    </form>
  );
};

export default AddTodo;
