package ro.ase.acs.classes;

import ro.ase.acs.interfaces.DataReader;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseDataReader implements DataReader {
    private static final String SQL_SELECT =  "SELECT * FROM employees";

    @Override
    public ResultSet readData(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(SQL_SELECT);
        return resultSet;
    }
}