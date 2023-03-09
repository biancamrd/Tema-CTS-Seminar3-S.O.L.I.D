package ro.ase.acs.classes;

import ro.ase.acs.interfaces.TableBuilder;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TableCreator implements TableBuilder {

    private static final String sqlDrop = "DROP TABLE IF EXISTS employees";
    private static final String sqlCreate = "CREATE TABLE employees(id INTEGER PRIMARY KEY,"
            + "name TEXT, address TEXT, salary REAL)";

    @Override
    public void createTable(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        statement.executeUpdate(sqlDrop);
        statement.executeUpdate(sqlCreate);
        statement.close();
    }
}