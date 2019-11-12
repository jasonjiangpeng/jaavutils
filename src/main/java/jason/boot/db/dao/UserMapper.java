package jason.boot.db.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;

@Mapper
public interface UserMapper {
    public void insert(DUser user);

    public void update(DUser user);

    public void delete(int id);

    public DUser find(int id);
    public List<DUser> findAll();

}
