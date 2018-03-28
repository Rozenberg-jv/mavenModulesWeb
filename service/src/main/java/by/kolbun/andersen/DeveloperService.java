package by.kolbun.andersen;

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
}
