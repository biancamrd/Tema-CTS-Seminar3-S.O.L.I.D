package ro.ase.acs.interfaces;

import java.sql.Connection;
import java.sql.SQLException;

public interface DatabaseConnection {
    Connection createConnection() throws SQLException;
}
