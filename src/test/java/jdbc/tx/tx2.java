package jdbc.tx;

import com.mycompany.springbasic1102.jdbc.tx.dao.BookDao;
import com.mycompany.springbasic1102.jdbc.tx.service.BookService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class tx2 {
    @Test
    public void t2() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc-config.xml");
        BookService bookService = ctx.getBean("bookServiceImpl", BookService.class);
        System.out.println(bookService);
        int wid = 2;
        int bid = 1;
        bookService.buyOne(wid, bid);
        
}
}
