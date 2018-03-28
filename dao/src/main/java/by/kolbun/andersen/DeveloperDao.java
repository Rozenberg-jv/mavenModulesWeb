package by.kolbun.andersen;

import org.hibernate.Session;
import org.hibernate.Transaction;

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
        return 1;
    }

    public Developer read(int id) {
        return null;
    }

    public void update(Developer dev) {

    }

    public void delete(int id) {

    }
}
