package jason.boot.control;


import jason.boot.bean.Nuser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.ArrayList; import java.util.List;


@Controller
    @RequestMapping("/hello")
    public class HelloController {
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(ModelMap modelMap)
    { modelMap.put("msg", "SpringBoot Ajax 示例"); return "index"; }
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    @ResponseBody public String home() { return "home"; }
    @RequestMapping(value = "/data", method = RequestMethod.POST)
    @ResponseBody public List<Nuser> data() {
        List<Nuser> list = new ArrayList<Nuser>();

    for (int i = 0; i < 10; i++) {
        Nuser user = new Nuser();

    user.setId(i + 1); user.setName("springboot" + i);
    user.setSex("male"); user.setAge(i + 1);
    user.setRole("developer"); list.add(user);
    }
    return list;
}
}


