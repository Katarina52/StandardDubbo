package cn.zhf;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("cn.xyc.dao")
@EnableDubbo
@SpringBootApplication
public class StandardProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(StandardProviderApplication.class, args);
    }

}
