package ua.aom.alevel.dao.impl;

import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import ua.aom.alevel.config.HibernateConfig;
import ua.aom.alevel.dao.CourseDao;
import ua.aom.alevel.dto.CourseDto;
import ua.aom.alevel.entity.Course;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class CourseDaoImpl implements CourseDao {
    private final SessionFactory factory = HibernateConfig.getInstance().getSessionFactory();

    @Override
    public void create(Course entity) {
        try (Session session = factory.getCurrentSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(entity);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Course entity) {
        try (Session session = factory.getCurrentSession()) {
            Transaction transaction = session.beginTransaction();
            session.update(entity);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Course entity) {
        try (Session session = factory.getCurrentSession()) {
            Transaction transaction = session.beginTransaction();
            session.delete(entity);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Optional<Course> findById(Long id) {
        try (Session session = factory.getCurrentSession()) {
            Transaction transaction = session.beginTransaction();
            Query query = session.createQuery("from Course as c where c.id = :id")
                    .setParameter("id", id);
            Course course = (Course) query.getResultList().get(0);
            transaction.commit();
            return Optional.of(course);
        } catch (Exception e) {
            return Optional.empty();
        }
    }

    @Override
    public List<Course> findAll() {
        List<Course> courses = new ArrayList<>();
        try (Session session = factory.getCurrentSession()) {
            Transaction transaction = session.beginTransaction();
            Query query = session.createQuery("from Course");
            courses = query.getResultList();
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return courses;
    }

    @Override
    public List<CourseDto> findCourseDto() {
        try (Session session = factory.getCurrentSession()) {
            Transaction transaction = session.beginTransaction();
            Query query = session.createQuery("select new ua.aom.alevel.dto.CourseDto(c, count(c.id)) from Course c join c.studentSet group by c.id");
            List<CourseDto> dto = query.getResultList();
            transaction.commit();
            return dto;
        } catch (Exception e) {
            return Collections.emptyList();
        }
    }
}
