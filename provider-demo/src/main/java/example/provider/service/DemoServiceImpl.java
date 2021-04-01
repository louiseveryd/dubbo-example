package example.provider.service;

import example.api.service.DemoService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;

import java.util.Random;

/**
 * 实现Dubbo 服务提供方
 * @author lr
 * @date 2021/4/1
 */
@DubboService(version = "1.0.0")
public class DemoServiceImpl implements DemoService {

    @Value("${dubbo.application.name}")
    private String serviceName;

    @Override
    public String sayHello(String name) {
        await();
        return String.format("[%s] : Hello, %s", serviceName, name);
    }

    /**
     * 设置超时
     */
    private void await() {
        try {
            long timeInMillisToWait = costTimeRandom.nextInt(500);
            Thread.sleep(timeInMillisToWait);
            System.out.println("execution time : " + timeInMillisToWait + " ms.");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private final Random costTimeRandom = new Random();

}
