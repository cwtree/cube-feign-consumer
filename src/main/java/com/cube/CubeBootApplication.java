package com.cube;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * 
 * @author phoenix
 * @date 2021年2月10日
 * @EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
 */
@SpringBootApplication
@EnableAsync
@EnableScheduling
@EnableAspectJAutoProxy
@Slf4j
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
@EnableFeignClients
public class CubeBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(CubeBootApplication.class, args);
		if (log.isInfoEnabled()) {
			log.info("\n----------------------------------------------------------\n\t"
					+ "Application is running! Access URLs:\n\t"
					+ "swagger-ui: \thttp://ip:port/${context-path}/swagger-ui.html\n\t"
					+ "If you set the api switch true! \n\t"
					+ "----------------------------------------------------------");
		}
	}

}
