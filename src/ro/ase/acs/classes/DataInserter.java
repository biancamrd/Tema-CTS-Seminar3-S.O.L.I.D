package ro.ase.acs.classes;

import ro.ase.acs.interfaces.DataStorage;
import ro.ase.acs.interfaces.TableBuilder;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DataInserter implements DataStorage {
    private static final String SQL_INSERT = "INSERT INTO employees VALUES(1, 'Popescu Ion', 'Bucharest', 4000)";


    @Override
    public void insertData(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        statement.executeUpdate(SQL_INSERT);
        statement.close();

    }
}