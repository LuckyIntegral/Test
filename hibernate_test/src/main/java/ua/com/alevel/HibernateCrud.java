package ua.com.alevel;

import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import ua.com.alevel.config.HibernateConfig;
import ua.com.alevel.persistence.entity.User;

import java.util.Date;
import java.util.List;
import java.util.Random;

public class HibernateCrud  {
    private final HibernateConfig config = new HibernateConfig();

    public void crud() {
//        create();
//        update();
//        delete1();
//        delete2();
        findAll1();
//        findUserById1();
//        findUserById2();
    }

    private void findUserById2() {
        Session session = config.getFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        User user = session.find(User.class, 9L);
        System.out.println(user);
        transaction.commit();
    }

    private void findUserById1() {
        Session session = config.getFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from User u where u.id = :id")
                .setParameter("id", 7L);
        User user = (User) query.getResultList().get(0);
        System.out.println(user);
        transaction.commit();
    }

    private void findAll1() {
        try (Session session = config.getFactory().getCurrentSession();) {
            Transaction transaction = session.beginTransaction();
            Query query = session.createQuery("from User");
            List<User> users = query.getResultList();
            users.forEach(System.out::println);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void delete2() {
        Session session = config.getFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        Query query = session
                .createQuery("delete from User as u where u.id = :id")
                .setParameter("id", 4L );
        query.executeUpdate();
        transaction.commit();
    }

    private void delete1() {
        User user = generateUser();
        user.setId(1L);
        Session session = config.getFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.delete(user);
        transaction.commit();
    }

    private void update() {
        User user = generateUser();
        user.setId(2L);
        Session session = config.getFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(user);
        transaction.commit();
    }

    private void create() {
        try (Session session = config.getFactory().getCurrentSession();) {
            Transaction transaction = session.beginTransaction();
            session.save(generateUser());
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private User generateUser() {
        Random random = new Random();
        User user = new User();
        user.setAge(random.nextInt(200));
        user.setEmail("email " + random.nextInt(100));
        user.setLastName("last_name");
        user.setFirstName("name");
        user.setCreated(new Date());
        return user;
    }
}
