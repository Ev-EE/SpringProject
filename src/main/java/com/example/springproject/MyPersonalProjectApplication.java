package com.example.springproject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class MyPersonalProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyPersonalProjectApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(KafkaTemplate<String,String> kafkaTemplate)
	{
		return args -> {

			for (int i = 0; i<50; i++)
			{
				kafkaTemplate.send("myTopic", String.valueOf(i));
			}

		};
	}
}

//use test containers for persistence and kafka

//send an object over kafka

//persist to database and send out as kafka message.

//end product is web api that reads request and submits to queue. Then have an app that reads from topic that persists. and finally another that reads and notifies.