package example.consumer.call;

import example.api.service.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.Method;
import org.springframework.stereotype.Component;

/**
 * @author lr
 * @date 2021/4/1
 */
@Component
public class DemoServiceCall {

    @DubboReference(
            version = "1.0.0",
            url = "dubbo://127.0.0.1:12345",
            timeout = 100,
            methods = {
                    @Method(name = "sayHello", timeout = 300)
            })
    private DemoService demoService;

    public String call(String msg) {
        return demoService.sayHello(msg);
    }

}
