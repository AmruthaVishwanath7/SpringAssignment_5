package com.assignment.task5.SpringAssignment5;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/read")
	public String readData() {
		 return "HELLO";
	}
	
	@GetMapping("/data")
	public ResponseEntity<Object> getData(){
		Map<String, String> data = new HashMap<>();
		data.put("Amrutha", "08/07");
		data.put("Karthik", "08/04");
		return new ResponseEntity<>(data,HttpStatus.OK);
		
		
	}

}
