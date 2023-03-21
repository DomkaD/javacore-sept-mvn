import entity.Actor;
import entity.City;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Main {
    public static void main(String[] args) {
        StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml")
                .build();

        Metadata metadata = new MetadataSources(serviceRegistry)
                .addAnnotatedClass(/*Actor.class*/City.class)
                .getMetadataBuilder()
                .build();


        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
        Session session = sessionFactory.openSession();

        session.beginTransaction();

//        Actor actor = new Actor("Vasya","pupkin");
//        Actor actor1 = new Actor("kokos","good");
//        session.save(actor);
//        session.save(actor1);

//        City city1 = new City("Lviv",100);
//        City city1 = new City("Odessa",100);
//        City city1 = new City("Kyiv",100);
//        session.save(city1);



        session.getTransaction().commit();

        session.close();
        sessionFactory.close();
    }
}
