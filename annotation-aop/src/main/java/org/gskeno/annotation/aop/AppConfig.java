package org.gskeno.annotation.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("org.gskeno.annotation.aop")
@EnableAspectJAutoProxy(exposeProxy = true)
public class AppConfig {
}
