package ro.ase.acs.classes;

import ro.ase.acs.interfaces.DataWriter;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsoleDataWriter implements DataWriter {
    @Override
    public void displayResult(ResultSet resultSet) throws SQLException {
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            System.out.println("id: " + id);
            String name = resultSet.getString(2);
            System.out.println("name: " + name);
            String address = resultSet.getString("address");
            System.out.println("address: " + address);
            double salary = resultSet.getDouble("salary");
            System.out.println("salary: " + salary);
        }
        resultSet.close();
    }
}