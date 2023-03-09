package ro.ase.acs.classes;

import ro.ase.acs.interfaces.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Orchestrator {
    private DatabaseConnection databaseConnection;
    private TableBuilder tableBuilder;
    private DataReader dataReader;
    private DataWriter dataWriter;
    private DataStorage dataStorage;

    public Orchestrator(DatabaseConnection databaseConnection, TableBuilder tableBuilder, DataReader dataReader,
                        DataWriter dataWriter, DataStorage dataStorage) {
        this.databaseConnection = databaseConnection;
        this.tableBuilder = tableBuilder;
        this.dataReader = dataReader;
        this.dataWriter = dataWriter;
        this.dataStorage = dataStorage;
    }

    public void setDataStorage(DataStorage dataStorage) {
        this.dataStorage = dataStorage;
    }

    public void runWorkflow(){
        try {
            Connection connection = databaseConnection.createConnection();
            tableBuilder.createTable(connection);
            dataStorage.insertData(connection);
            ResultSet resultSet = dataReader.readData(connection);
            dataWriter.displayResult(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}