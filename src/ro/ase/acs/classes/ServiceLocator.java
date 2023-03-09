package ro.ase.acs.classes;

import ro.ase.acs.interfaces.*;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class ServiceLocator {
    private Map<Type, Object> map = new HashMap<>();

    public ServiceLocator(){
        map.put(DatabaseConnection.class, new ConnectionCreator());
        map.put(TableBuilder.class, new TableCreator());
        map.put(DataReader.class, new DatabaseDataReader());
        map.put(DataWriter.class, new ConsoleDataWriter());
        map.put(DataStorage.class, new DataInserter());
    }

    public <T> T get(Type contract){
        return (T)map.get(contract);
    }
}