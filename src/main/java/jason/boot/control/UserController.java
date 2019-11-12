package jason.boot.control;

import jason.boot.component.UserService;
import jason.boot.db.dao.DUser;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@RestController
@ComponentScan({"jason.boot.component"})
@MapperScan("jason.boot.db.dao")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/say")
    public String say(){
        return "springboot-a";
    }

    @RequestMapping("/find")
    public String find(){
        DUser user =  userService.find(2);
        ModelAndView mav = new ModelAndView();
        mav.addObject("user","sadf");
        return "你喜欢谁:"+user.getName()+"--他的年龄"+user.getAge();
    }


    @RequestMapping("/ajax")
    public String find1(){
        return "[''message':'123dfx']";
    }
}
