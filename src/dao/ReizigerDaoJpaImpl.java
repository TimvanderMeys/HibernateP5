package dao;

import domain.Reiziger;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ReizigerDaoJpaImpl extends HibernateUtil implements ReizigerDao  {
    private static org.hibernate.SessionFactory factory = getSessionFactory();

    @Override
    public void insert(Reiziger entity) {
        try (Session session = factory.getCurrentSession()) {
            Transaction t = session.beginTransaction();

            t.commit();
        }
    }

    @Override
    public void update(Reiziger entity) {
        try (Session session = factory.getCurrentSession()) {
            Transaction t = session.beginTransaction();

            session.update(entity);

            t.commit();
        }
    }

    @Override
    public Reiziger findById(int id) {
        try(Session session = factory.getCurrentSession()) {
            Transaction t = session.beginTransaction();

            System.out.println(Reiziger.class);
            Reiziger entity = session.get(Reiziger.class, id);

            t.commit();

            return entity;
        }
    }

    @Override
    public void delete(Reiziger entity) {
        try (Session session = factory.getCurrentSession()) {
            Transaction t = session.beginTransaction();

            session.delete(entity);

            t.commit();
        }
    }
}
