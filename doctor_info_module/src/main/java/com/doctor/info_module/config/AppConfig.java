package com.doctor.info_module.config;

import org.springframework.boot.SpringBootConfiguration;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * Description:
 * GET-version:
 * Date:2021-01-29  10:40
 * Author: wxr
 */
@SpringBootConfiguration
@MapperScan(basePackages={"com.doctor.info_module.entity"})
public class AppConfig {
}
