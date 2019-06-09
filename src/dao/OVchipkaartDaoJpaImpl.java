package dao;

import domain.OVchipkaart;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class OVchipkaartDaoJpaImpl extends HibernateUtil implements OVchipkaartDao {
    private static org.hibernate.SessionFactory factory = getSessionFactory();

    @Override
    public void insert(OVchipkaart entity) {
        try (Session session = factory.getCurrentSession()) {
            Transaction t = session.beginTransaction();

            session.save(entity);

            t.commit();
        }
    }

    @Override
    public void update(OVchipkaart entity) {
        try (Session session = factory.getCurrentSession()) {
            Transaction t = session.beginTransaction();

            session.update(entity);

            t.commit();
        }
    }

    @Override
    public OVchipkaart findById(int id) {
        try(Session session = factory.getCurrentSession()) {
            Transaction t = session.beginTransaction();

            OVchipkaart entity = session.get(OVchipkaart.class, id);

            t.commit();

            return entity;
        }
    }

    @Override
    public void delete(OVchipkaart entity) {
        try (Session session = factory.getCurrentSession()) {
            Transaction t = session.beginTransaction();

            session.delete(entity);

            t.commit();
        }
    }
}
