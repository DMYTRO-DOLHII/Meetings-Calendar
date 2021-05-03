package com.example.MeetingsCalendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Duration;
import java.time.ZonedDateTime;

@SpringBootApplication
public class MeetingsCalendarApplication {

	public static void main(String[] args) {

		Meeting meeting = Meeting
				.newBuilder()
				.id("")
				.startsAt(ZonedDateTime.now())
				.duration(Duration.ofHours(2))
				.build();


		SpringApplication.run(MeetingsCalendarApplication.class, args);
	}

}
