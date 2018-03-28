package by.kolbun.andersen;

import java.util.List;

public class DeveloperService {

    DeveloperDao dao = DeveloperDao.getInstance();

    public int addNewDeveloper(Developer dev) {
        return dao.create(dev);
    }

    public Developer getDeveloper(int id) {
        return dao.read(id);
    }

    public void updateDeveloper(Developer dev) {
        dao.update(dev);
    }

    public void deleteDeveloper(int id) {
        dao.delete(id);
    }

    public List getAllDevelopers() {
        return dao.getAll();
    }

    public int addNewDeveloper(String name, String specialty, int salary) {
        Developer dev = new Developer(name, specialty, salary);
        return dao.create(dev);
    }
}
