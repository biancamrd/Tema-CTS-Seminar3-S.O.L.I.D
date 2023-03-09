package ro.ase.acs.classes;

import ro.ase.acs.interfaces.DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionCreator implements DatabaseConnection {
    private static final String CONNECTION = "jdbc:sqlite:database.db";


    @Override
    public Connection createConnection() throws SQLException {
        return DriverManager.getConnection(CONNECTION);
    }
}