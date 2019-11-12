package jason.boot.control;


import jason.boot.bean.Message;
import jason.boot.bean.User;

import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/test")
public class Helloword {
    private static Logger logger = Logger.getLogger(Helloword.class);
    @RequestMapping("/value")
    public String hellword(@RequestParam("name") String name,@RequestParam("sex") String  sex){
    String value=" \"hello world\"+name+\"sex\"+sex";
    logger.info(value);
        return value;
    }
    @PostMapping(value = "/data",produces =MediaType.APPLICATION_JSON_UTF8_VALUE )
    public Message testJson(@ModelAttribute Message message){


        return  message;
    }

    @GetMapping(value = "/test")
    public String query() {
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletResponse response = servletRequestAttributes.getResponse();
     //   response.setHeader("Access-Control-Allow-Origin", "http://localhost:8080");
     //   response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Credentials", "true");

        return "hello";
    }

}
