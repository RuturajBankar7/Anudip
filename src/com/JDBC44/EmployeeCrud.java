package com.JDBC44;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeeCrud {

    public static void main(String[] args) throws Exception {
        // Database connection details
        final String URL = "jdbc:mysql://localhost:3306/demo";
        final String USER = "root";
        final String PASSWORD = "root@123";

        Connection con = null;
        PreparedStatement pstmt = null;
        Statement stmt = null;
        ResultSet rs = null;
        Scanner sc = new Scanner(System.in);

        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection to the database
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            stmt = con.createStatement();

            // Check if the Employee table exists; if not, create it
            if (!isTableExists(con, "Employee")) {
                createEmployeeTable(stmt);
            }

            int operation;

            do {
                // Display available operations to the user
                System.out.println("Available Operations : ");
                System.out.println("1. Create");
                System.out.println("2. Retrieve");
                System.out.println("3. Delete");
                System.out.println("4. Update");
                System.out.println("5. Exit");
                System.out.print("Enter the action: ");

                operation = sc.nextInt();
                sc.nextLine();

                switch (operation) {
                    case 1:
                        // Collect employee details from the user
                        System.out.print("Enter the employee ID: ");
                        int ID = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter the employee first name: ");
                        String firstName = sc.nextLine();
                        System.out.print("Enter the employee last name: ");
                        String lastName = sc.nextLine();
                        System.out.print("Enter the employee age: ");
                        int age = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter the employee salary: ");
                        int salary = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter the employee designation: ");
                        String designation = sc.nextLine();

                        // Insert employee details into the Employee table
                        pstmt = con.prepareStatement("INSERT INTO Employee VALUES (?, ?, ?, ?, ?, ?)");
                        pstmt.setInt(1, ID);
                        pstmt.setString(2, lastName);
                        pstmt.setString(3, firstName);
                        pstmt.setInt(4, age);
                        pstmt.setInt(5, salary);
                        pstmt.setString(6, designation);

                        int rowsInserted = pstmt.executeUpdate();
                        System.out.println(rowsInserted + " data added.");
                        break;

                    case 2:
                        // Retrieve all employees from the Employee table
                        rs = stmt.executeQuery("SELECT * FROM Employee");

                        // Display retrieved employees
                        while (rs.next()) {
                            ID = rs.getInt("ID");
                            lastName = rs.getString("lastName");
                            firstName = rs.getString("firstName");
                            age = rs.getInt("age");
                            salary = rs.getInt("salary");
                            designation = rs.getString("designation");

                            System.out.println(ID + " " + lastName + " " + firstName + " " + age + " " + salary + " " + designation);
                        }
                        break;

                    case 3:
                        // Get the employee ID to delete
                        System.out.print("Enter ID to delete: ");
                        ID = sc.nextInt();
                        sc.nextLine();

                        // Delete the employee with the given ID
                        pstmt = con.prepareStatement("DELETE FROM Employee WHERE ID = ?");
                        pstmt.setInt(1, ID);

                        int rowsDeleted = pstmt.executeUpdate();
                        System.out.println(rowsDeleted + " row deleted");
                        break;

                    case 4:
                        // Get the employee ID and new details to update
                        System.out.print("Enter the employee ID: ");
                        ID = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter the new employee first name: ");
                        firstName = sc.nextLine();
                        System.out.print("Enter the new employee last name: ");
                        lastName = sc.nextLine();
                        System.out.print("Enter the new employee age: ");
                        age = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter the new employee salary: ");
                        salary = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter the new employee designation: ");
                        designation = sc.nextLine();

                        // Update the employee details in the Employee table
                        pstmt = con.prepareStatement("UPDATE Employee SET lastName=?, firstName=?, age=?, salary=?, designation=? WHERE ID=?");
                        pstmt.setString(1, lastName);
                        pstmt.setString(2, firstName);
                        pstmt.setInt(3, age);
                        pstmt.setInt(4, salary);
                        pstmt.setString(5, designation);
                        pstmt.setInt(6, ID);

                        int rowsUpdated = pstmt.executeUpdate();
                        System.out.println(rowsUpdated + " row(s) updated.");
                        break;

                    case 5:
                        // Exit the application
                        System.out.println("Exiting...");
                        break;

                    default:
                        // Handle invalid options
                        System.out.println("Invalid option. Please enter a valid option.");
                        break;
                }
            } while (operation != 5);

        } finally {
            // Close resources in the finally block to ensure they are closed even if an exception occurs
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (pstmt != null) {
                pstmt.close();
            }
            if (con != null) {
                con.close();
            }
            if (sc != null) {
                sc.close();
            }
        }
    }

    // Method to check if a table exists in the database
    private static boolean isTableExists(Connection con, String tableName) throws SQLException {
        ResultSet tables = con.getMetaData().getTables(null, null, tableName, null);
        return tables.next();
    }

    // Method to create the Employee table if it doesn't exist
    private static void createEmployeeTable(Statement stmt) throws SQLException {
        String createTableSQL = "CREATE TABLE Employee (" +
                                "ID INT NOT NULL," +
                                "lastName VARCHAR(255)," +
                                "firstName VARCHAR(255)," +
                                "age INT," +
                                "salary INT," +
                                "designation VARCHAR(255)," +
                                "PRIMARY KEY (ID)" +
                                ")";
        stmt.executeUpdate(createTableSQL);
        System.out.println("Employee table created.");
    }
}

/*Dry Run

#### Initial Setup
1. **Database Connection**: Connect to the MySQL database using the provided URL, username, and password.
2. **Check Table Existence**: Check if the `Employee` table exists. If not, create the table with the specified columns.

#### User Interaction
1. **Display Operations**: Display a menu with the following options: Create, Retrieve, Delete, Update, Exit.
2. **Input Operation**: The user selects an operation to perform.

#### Case: Create
1. **Input Details**: Prompt the user to enter the employee's ID, first name, last name, age, salary, and designation.
2. **Insert Data**: Insert the entered details into the `Employee` table.
3. **Output**: Display the number of rows added.

#### Case: Retrieve
1. **Execute Query**: Execute a `SELECT * FROM Employee` query.
2. **Output Data**: Loop through the result set and display each employee's details.

#### Case: Delete
1. **Input ID**: Prompt the user to enter the ID of the employee to delete.
2. **Delete Data**: Delete the employee with the entered ID from the `Employee` table.
3. **Output**: Display the number of rows deleted.

#### Case: Update
1. **Input Details**: Prompt the user to enter the employee's ID and the new first name, last name, age, salary, and designation.
2. **Update Data**: Update the employee's details in the `Employee` table based on the entered ID.
3. **Output**: Display the number of rows updated.

#### Case: Exit
1. **Exit Message**: Display an exit message and terminate the loop.

#### Default Case
1. **Invalid Option**: Display an error message for invalid options.

### Resource Management
1. **Close Resources**: Close the `ResultSet`, `Statement`, `PreparedStatement`, `Connection`, and `Scanner` objects in the `finally` block to ensure they are closed even if an exception occurs.*/