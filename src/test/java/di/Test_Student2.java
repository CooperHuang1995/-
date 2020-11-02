package di;

import com.mycompany.springbasic1102.di.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_Student2 {
    @Test
    public void test()
    {
        ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("beans-config.xml");
        Student s1=(Student)ctx.getBean("s1");
        System.out.println(s1);
        /*Student s2=ctx.getBean(Student.class);//第二種寫法,無須轉型,前提是只有一個bean
        System.out.println(s2);*/
        Student s2=ctx.getBean("s2",Student.class);//需要告訴她是哪一個Student=>"s2"
        System.out.println(s2);
        
        
    }
}
