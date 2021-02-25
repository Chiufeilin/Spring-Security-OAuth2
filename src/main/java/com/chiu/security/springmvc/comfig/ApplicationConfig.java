package com.chiu.security.springmvc.comfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

//spring容器会扫描注解，发现@Configuration就知道这里是一个配置类
//@ComponentScan注解定义扫描的规则spring容器加载需要扫描的基础包,排除掉带有controller注解的文件

@Configuration//此处的@Configuration就相当于applicationContext.xml文件
@ComponentScan(basePackages = "com.chiu.security.springmvc"
        , excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = Controller.class)})
public class ApplicationConfig {
    // 配置除了controller的其他bean，比如：数据库连接池，事务管理器，业务bean等
}
