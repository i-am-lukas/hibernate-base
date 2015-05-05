import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Main {

    public static void main(String[] args9) {

        SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session session = factory.openSession();

        session.beginTransaction();
        session.getTransaction().commit();

        session.close();
        factory.close();
    }

}
