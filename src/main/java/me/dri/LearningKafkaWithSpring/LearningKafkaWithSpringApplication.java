package me.dri.LearningKafkaWithSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class LearningKafkaWithSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningKafkaWithSpringApplication.class, args);
	}

}
