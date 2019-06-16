package com.along.mica;

import cn.along.mica.scheduler.MicaScheduler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:spring-config.xml")
public class MicaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicaApplication.class, args);
		MicaScheduler.init();
	}

}
