package com.yiran.reactSpringDataCRUD;

import java.time.Instant;
import java.util.Collections;
import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.yiran.reactSpringDataCRUD.model.Event;
import com.yiran.reactSpringDataCRUD.model.Group;
import com.yiran.reactSpringDataCRUD.model.GroupRepository;

@Component
public class Initializer implements CommandLineRunner {

	private final GroupRepository repository;
	
	public Initializer(GroupRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		Stream.of("Denver JUG", "Utah JUG", "Seattle JUG",
                "Richmond JUG").forEach(name -> 
                repository.save(new Group(name))
                );
		
		Group group = repository.findByName("Denver JUG");
		Event e = Event.builder()
				.title("Full Stack Reactive")
				.description("Reactive with Spring Boot + React")
				.date(Instant.parse("2018-12-12T18:00:00.000Z"))
				.build();
		
		group.setEvents(Collections.singleton(e));
		repository.save(group);
		
		repository.findAll().forEach(System.out::println);
		
	}
	
}
