package ro.ase.acs.main;

import ro.ase.acs.classes.Orchestrator;
import ro.ase.acs.classes.ParameterizedDataInserter;
import ro.ase.acs.classes.ServiceLocator;
import ro.ase.acs.interfaces.*;

public class Main {
    public static void main(String[] args){
    ServiceLocator serviceLocator = new ServiceLocator();
    Orchestrator orchestrator = new Orchestrator(serviceLocator.get(DatabaseConnection.class),
            serviceLocator.get(TableBuilder.class), serviceLocator.get(DataReader.class),
            serviceLocator.get(DataWriter.class), serviceLocator.get(DataStorage.class));
        orchestrator.runWorkflow();
        orchestrator.setDataStorage(new ParameterizedDataInserter());
        orchestrator.runWorkflow();
    }
}