package by.kolbun.andersen;

import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class DeveloperDao {

    private static DeveloperDao instance = new DeveloperDao();
    private Session session = HibernateUtil.getSession();
    private Transaction transaction;

    public static DeveloperDao getInstance() {
        return instance;
    }

    private DeveloperDao() {
    }

    public int create(Developer dev) {
        transaction = session.beginTransaction();
        int id = (int) session.save(dev);
        transaction.commit();
        return id;
    }

    public Developer read(int id) {
        transaction = session.beginTransaction();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Developer> query = cb.createQuery(Developer.class);
        Root<Developer> root = query.from(Developer.class);
        query.select(root).where(cb.equal(root.get("id"), id));
        Developer result = session.createQuery(query).uniqueResult();
        transaction.commit();
        return result;
    }

    public void update(Developer dev) {
        transaction = session.beginTransaction();
        session.saveOrUpdate(dev);
        transaction.commit();
    }

    public void delete(int id) {
        transaction = session.beginTransaction();
        session.delete(session.load(Developer.class, id));
        transaction.commit();
    }

    synchronized public List<Developer> getAll() {
        transaction = session.beginTransaction();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Developer> query = cb.createQuery(Developer.class);
        Root<Developer> root = query.from(Developer.class);
        query.select(root);
        List<Developer> result = session.createQuery(query).list();
        transaction.commit();
        return result;
    }
}
