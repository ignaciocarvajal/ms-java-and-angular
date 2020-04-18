package us.ignaciocarvajald.ms.app.courses;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EntityScan({ "us.ignaciocarvajald.ms.commons.student.models.entity",
		"us.ignaciocarvajald.ms.app.courses.models.entity" })
public class MsCoursesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsCoursesApplication.class, args);
	}

}
