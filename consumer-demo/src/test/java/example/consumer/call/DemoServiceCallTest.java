package example.consumer.call;


import example.consumer.ConsumerDemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author lr
 * @date 2021/4/1
 */
@SpringBootTest(classes = ConsumerDemoApplication.class)
@RunWith(SpringRunner.class)
public class DemoServiceCallTest {

    @Autowired
    private DemoServiceCall call;

    @Test
    public void test() {
        System.out.println(call.call("ethan!"));
    }

}