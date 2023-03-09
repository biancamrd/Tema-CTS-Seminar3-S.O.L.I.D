package ro.ase.acs.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ParameterizedDataInserter extends DataInserter{
    private static final String SQL_INSERT_WITH_PARAMS = "INSERT INTO employees VALUES (?,?,?,?)";

    @Override
    public void insertData(Connection connection) throws SQLException {
        PreparedStatement preparedStatement =
                connection.prepareStatement(SQL_INSERT_WITH_PARAMS);
        preparedStatement.setInt(1,2);
        preparedStatement.setString(2, "Ionescu Vasile");
        preparedStatement.setString(3, "Brasov");
        preparedStatement.setDouble(4, 4500);
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }
}