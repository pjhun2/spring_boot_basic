package com.spring.bo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // enableAutoConfiguration, ComponentScan, Cofniguration을 하나로 묶은 어노테이션
                       // - 스프링부트를 기동하기 위해서는 main 메소드가 필요한데 여기에SpringApplication.run(BoApplication.class, args); 이 부분이 들어 간다.
                       // 해당 어노테이션을 설정한 클래스가 있는 패키지를 최상위 패키지로 인식하고 컴포넌트 스캔을 수행하기 때문에 해당 어노테이션이 있는 클래스의 파일 위치 또한 중요하다

public class BoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoApplication.class, args);
	}

}