package jason.boot.test;

import jason.boot.db.dao.Book;
import jason.boot.server.BookService;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestBookService {
    @Before
public void b1(){
        System.out.println("我来了");

}
    @Test
    public void b2(){
        System.out.println("测试");

    }
}
