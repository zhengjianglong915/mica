package com.along.mica;

import cn.along.mica.scheduler.MicaScheduler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicaApplication.class, args);
		MicaScheduler.init();
	}

}
