package jason.boot.component;

import jason.boot.db.dao.DUser;
import jason.boot.db.dao.UserMapper;
import jason.boot.server.UserIService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@ComponentScan({"ssm.springboot_ftl.mapper"})
@Service("userService")


public class UserService implements UserIService {

    @Resource
    private UserMapper userMapper;
    @Override
    public void insert(DUser user) {
           userMapper.insert(user);
    }

    @Override
    public void update(DUser user) {
          userMapper.update(user);
    }

    @Override
    public DUser find(int id) {
        return userMapper.find(id);
    }

    @Override
    public void delete(int id) {
       userMapper.delete(id);
    }

    @Override
    public List<DUser> findAll() {
        return userMapper.findAll();
    }
}
