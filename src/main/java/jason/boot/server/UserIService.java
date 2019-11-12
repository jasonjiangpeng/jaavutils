package jason.boot.server;

import jason.boot.db.dao.DUser;

import java.util.List;

public interface UserIService {
    public void insert(DUser user);

    public void update(DUser user) ;

    public DUser find(int id);

    public void delete(int id);
    public List<DUser> findAll();
}
