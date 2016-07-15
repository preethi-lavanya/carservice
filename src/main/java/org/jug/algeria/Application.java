package org.jug.algeria;

import org.jug.algeria.config.AppConfig;
import org.jug.algeria.server.ServletContainerCustomizer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(new Object[] { AppConfig.class, ServletContainerCustomizer.class }, args);
	}
}
