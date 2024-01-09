package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
@Autowired
service s;

@PostMapping("/insert1")
String m(@RequestBody pojo o1) {
	int l=s.insert(o1);
	try {
		if(l>0) {
			return "row inserted";
		}
		else {
			return "not inserted";
		}
		
	} catch (Exception e) {
		// TODO: handle exception
		return e.getMessage(); 
	}
}

@PostMapping("/delete1")
String m1(@RequestBody pojo o2) {
	int l1=s.delete(o2);
	try {
		if(l1>0) {
			return "row deleted";
		}
		else {
			return "not deleted";
		}
		
	} catch (Exception e) {
		// TODO: handle exception
		return e.getMessage(); 
	}
}



}
