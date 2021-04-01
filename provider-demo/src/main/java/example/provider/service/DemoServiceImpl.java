package example.provider.service;

import example.api.service.DemoService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;

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
        return String.format("[%s] : Hello, %s", serviceName, name);
    }

}
