package org.debugroom.mynavi.sample.ecs.backend.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
@ComponentScan("org.debugroom.mynavi.sample.ecs.backend.app.web")// app.web配下もDIに登録する対象とする。
public class MvcConfig implements WebMvcConfigurer {
}