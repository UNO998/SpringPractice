package com.luv2code.jackson.json.demo;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		
		// create object mapper
		ObjectMapper mapper = new ObjectMapper();
		
		// read JSON from file and map/convert to Java POJO
		try {
			Student myStudent = mapper.readValue(new File("data/sample-full.json"), Student.class);
			
			System.out.println(myStudent);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
