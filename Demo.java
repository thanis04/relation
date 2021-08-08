import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Demo {
    public static void main(String[] args) {
        /*Configuration configuration = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(Computer.class)
                .addAnnotatedClass(Book.class)
                .addAnnotatedClass(Subject.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();*/
        Session session = HibernateUtil.getSession();
    }
}
