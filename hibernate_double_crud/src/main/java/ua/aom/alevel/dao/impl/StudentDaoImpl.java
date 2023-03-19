package ua.aom.alevel.dao.impl;

import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import ua.aom.alevel.config.HibernateConfig;
import ua.aom.alevel.dao.StudentDao;
import ua.aom.alevel.entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentDaoImpl implements StudentDao {
    private final SessionFactory factory = HibernateConfig.getInstance().getSessionFactory();

    @Override
    public void create(Student student) {
        try (Session session = factory.getCurrentSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(student);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Student student) {
        try (Session session = factory.getCurrentSession()) {
            Transaction transaction = session.beginTransaction();
            session.update(student);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Student entity) {
        try (Session session = factory.getCurrentSession()) {
            Transaction transaction = session.beginTransaction();
            session.delete(entity);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Optional<Student> findById(Long id) {
        try (Session session = factory.getCurrentSession()) {
            Transaction transaction = session.beginTransaction();
            Query query = session.createQuery("from Student as c where c.id = :id")
                    .setParameter("id", id);
            Student student = (Student) query.getResultList().get(0);
            transaction.commit();
            return Optional.of(student);
        } catch (Exception e) {
            return Optional.empty();
        }
    }

    @Override
    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        try (Session session = factory.getCurrentSession()) {
            Transaction transaction = session.beginTransaction();
            Query query = session.createQuery("from Student");
            students = query.getResultList();
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }
}
