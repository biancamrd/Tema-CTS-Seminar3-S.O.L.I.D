package ro.ase.acs.interfaces;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface DataReader {
    ResultSet readData(Connection connection) throws SQLException;
}
