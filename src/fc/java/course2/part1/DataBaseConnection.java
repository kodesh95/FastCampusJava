package fc.java.course2.part1;

import fc.java.course2.model.Connection;
import fc.java.course2.model.MSSQLDriver;
import fc.java.course2.model.MySQLDriver;
import fc.java.course2.model.OracleDriver;

public class DataBaseConnection {
    public static void main(String[] args) {

        // oracle DB접속
        Connection connection = new OracleDriver();

        connection.getConnection("jdbc:oracle:thin:@localhost:1521:XE",
                "system","manager");

        // mysql DB접속
        connection= new MySQLDriver();

        connection.getConnection("jdbc:mysql://localhost:3306/test",
                "root","12345");

        // mssql DB접속
        connection = new MSSQLDriver();

        connection.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=mem",
                "sa","12345");
    }
}
