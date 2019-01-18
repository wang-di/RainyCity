package com.wd.xyf.conf;

import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName ServletConfiguration
 * @Description TODO
 * @Author wangdi
 * @Date 2019/1/18 15:15
 * @Version 1.0
 **/
@Configuration
@ServletComponentScan(basePackages = "com/wd/xyf/")
public class ServletConfiguration {
}
