package com.xuecheng;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

// 启动项目后访问地址: http://localhost:5100/content/swagger-ui.html

@SpringBootApplication
@EnableSwagger2Doc
@MapperScan("com.xuecheng.content.mapper")
public class ServiceContentApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceContentApplication.class, args);
    }

}
