package com.xmy.demonowcoder;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * tomcat 访问这个类作为入口来启动运行项目，运行时核心配置文件为DemoNowcoderApplication.class
 * @author xumingyu
 * @date 2022/6/11
 **/
public class CommunityServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(DemoNowcoderApplication.class);
    }
}
