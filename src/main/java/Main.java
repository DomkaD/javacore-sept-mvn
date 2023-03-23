import entity.Car;
import entity.DriveLicense;
import entity.Owner;
import entity.Type;
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
                .addAnnotatedClass(Owner.class)
                .addAnnotatedClass(Car.class)
                .addAnnotatedClass(DriveLicense.class)
                .getMetadataBuilder()
                .build();


        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
        Session session = sessionFactory.openSession();

        session.beginTransaction();

        Owner owner = new Owner("LALALA",new DriveLicense("1245hnfr2ty34jrngbge23"));
        Car car = new Car(Type.MINIVAN,"poiuygvbcjuyg", 230.4, 3000, 2002);
        session.save(owner);
        session.save(car);

        owner.getCars().add(car);

        session.getTransaction().commit();

        session.close();
        sessionFactory.close();
    }
}
