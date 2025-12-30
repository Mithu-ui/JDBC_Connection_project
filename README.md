JDBC Menu-Driven Database Application
A simple Java JDBC console-based application that performs CRUD (Create, Read, Update, Delete) operations on a MySQL database using PreparedStatement.
The project demonstrates core JDBC concepts and clean separation between database access and application logic.
📌 Features:
->Connects to a MySQL database using JDBC
->Menu-driven console interface
->Supports dynamic SQL execution
->CRUD operations:
  ->Read data from tables
  ->Insert new records
  ->Update existing records
  ->Delete records
->Uses PreparedStatement for efficient SQL execution
->Displays query results dynamically using ResultSetMetaData
🏗️ Project Structure
Project_DBMS
│
├── ConnectionDAO.java   # Handles database connection
├── MainClass.java       # Menu-driven application logic
⚙️ Technologies Used
->Java
->JDBC
->MySQL
->Console I/O
🧠 How the Application Works
->The user is shown a menu with database operations.
->The user selects an option and enters an SQL query.
->ConnectionDAO establishes the database connection.
->The query is executed using PreparedStatement.

Output is displayed on the console.
