package ro.ase.acs.interfaces;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface DataWriter {
    void displayResult(ResultSet resultSet) throws SQLException;
}
