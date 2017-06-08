package myproperty.v1.db;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Mover on 4/27/2017.
 */
public class EntityManagerFactoryProvider {
    private static EntityManagerFactoryProvider instance;
    private final Map<String,EntityManagerFactory> factories;

    private static final Logger LOG = Logger.getLogger(EntityManagerFactoryProvider.class.getName());



    private EntityManagerFactoryProvider(){
        factories =  new HashMap<>();
    }


    public static EntityManagerFactoryProvider getInstance(){
        if(instance == null){
            instance = new EntityManagerFactoryProvider();
        }

        return instance;
    }

    public EntityManagerFactory getFactory(){

        EntityManagerFactory factory = null;
        String database = getDatabase();

        if(factories.containsKey(database)){
            LOG.log(Level.INFO,"Re Using Existing Database ");
            factory = factories.get(database);
        }
        else{
            try {
                factory = createFactory();
            }
            catch (Exception e){
                LOG.log(Level.SEVERE,"Factory Could Not Be Created");
                e.printStackTrace();
            }
        }

        return factory;

    }


    public  EntityManagerFactory createFactory(){
        EntityManagerFactory emf = null;
        Map<String,String> properties = new HashMap<>();
        properties.put("hibernate.connection.url", "jdbc:mysql://localhost:3306/" + getDatabase());
        properties.put("hibernate.connection.username", "root");
        properties.put("hibernate.connection.password", "mysql");
        properties.put("hibernate.ejb.entitymanager_factory_name", getDatabase());
        try{
            // properties
            emf = Persistence.createEntityManagerFactory("MYPROPERTY",properties);

        }catch (Exception e){
            e.printStackTrace();
            LOG.log(Level.SEVERE,"Un Expected Error "+e.toString());
        }

        return emf;
    }

    public static void setInstance(EntityManagerFactoryProvider instance) {
        EntityManagerFactoryProvider.instance = instance;
    }

    public Map<String, EntityManagerFactory> getFactories() {
        return factories;
    }

    public static Logger getLOG() {
        return LOG;
    }

    private String getDatabase() {
        return "my_property";
    }


}
