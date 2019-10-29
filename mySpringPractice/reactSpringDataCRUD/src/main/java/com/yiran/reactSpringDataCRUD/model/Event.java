package com.yiran.reactSpringDataCRUD.model;

import java.time.Instant;
import java.util.Set;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Event {

	private Long id;
	private Instant date;
	private String title;
	private String description;
	
	private Set<User> attendees;
}
