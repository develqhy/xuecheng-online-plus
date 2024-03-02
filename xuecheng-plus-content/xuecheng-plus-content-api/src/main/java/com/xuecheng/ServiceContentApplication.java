package com.xuecheng;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 启动项目后访问地址: http://localhost:9100/content/swagger-ui.html

@SpringBootApplication
@EnableSwagger2Doc
public class ServiceContentApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceContentApplication.class, args);
    }

}
