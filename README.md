
# Todo List App

This is a full-stack Todo List application built with **Spring Boot** (backend) and **React** (frontend). The application allows users to manage their tasks efficiently, assign priorities, and perform CRUD operations. It is styled using **Bootstrap** for a modern and responsive user interface.

---

## Features
- Add, update, delete, and mark todos as complete.
- Set priorities (High, Medium, Low) for each todo.
- Real-time synchronization with the backend.
- User-friendly interface built with React and Bootstrap.

---

## Technologies Used

### Backend
- **Spring Boot** for RESTful APIs
- **Hibernate** for ORM
- **MySQL** for database
- **Spring Security** (optional)

### Frontend
- **React.js** for the user interface
- **Bootstrap** for styling
- **Axios** for API calls

---

## Prerequisites

### Backend
1. Install Java (JDK 17 or higher).
2. Install MySQL and configure a database.
3. Install Maven for dependency management.

### Frontend
1. Install Node.js (v16 or higher).
2. Install npm (comes with Node.js).

---

## Getting Started

### Backend Setup
1. Clone the repository.
   ```bash
   git clone https://github.com/your-username/todo-list-app.git
2. Navigate to the backend directory.
   ```bash
   cd todo-list-app/backend
3. Configure the application properties file .
   (src/main/resources/application.properties) for your database.
5. Build and run the application.
   ```bash
   mvn spring-boot:run

### Frontend Setup
1. Navigate to the frontend directory.
   ```bash
   cd todo-list-app/frontend
2. Install dependencies.
   ```bash
   npm install
3. Start the React development server.
   ```bash
   npm start

---

### API Endpoints
- **GET /api/todos/findAll** - Fetch all todos.
- **POST /api/todos** - Add a new todo.
- **PUT /api/todos/{id}/complete** - Mark a todo as complete.
- **DELETE /api/todos/{id}** - Delete a todo.

---

### Screenshots
- **Directory Structure for Backend.**

![image](https://github.com/user-attachments/assets/3e524cda-372c-4cd5-b703-9ba74a75bd9b)

- **Directory Structure for Frontend.**

![image](https://github.com/user-attachments/assets/9b762fa8-7328-4437-9bdc-9c08b90d02ca)

- **Database Schema.**

![image](https://github.com/user-attachments/assets/9bb8eef5-5ccd-433b-a0a3-8e292ba9d0c3)

- **Index Page.**

![image](https://github.com/user-attachments/assets/c3c26857-ba50-402c-b234-127448f8c00e)


---

### Contributions   
   Contributions are welcome! Please open an issue or submit a pull request.

---

### License
   This project is licensed under the MIT License - see the LICENSE file for details.

---

### Author
   Pranav Sanjay Manapure
   - **Email:** manapurepranav03@gmail.com
   - **LinkedIn:** www.linkedin.com/in/pranav-manapure
