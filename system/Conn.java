package bank.management.system;

import java.sql.*;

public class Conn {
    Connection c;
    Statement s;

    public Conn() {
        try {
            // Correct JDBC URL
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem", "root", "1234");
            s = c.createStatement();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
