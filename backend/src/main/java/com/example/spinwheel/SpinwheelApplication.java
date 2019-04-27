package com.example.spinwheel;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@MapperScan("com.example.spinwheel.base.dao")
public class SpinwheelApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpinwheelApplication.class, args);
	}

}
