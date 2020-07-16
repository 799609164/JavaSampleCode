import com.xxx.demo.service.Hello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:SpringBeans.xml"})
public class HelloTest {
    @Autowired
    // @Qualifier 中的值换成 hello2，则会打印 hello xxx 2
    @Qualifier("hello1")
    private Hello hello;

    @Test
    public void sayHello(){
        hello.sayHello();
    }
}
