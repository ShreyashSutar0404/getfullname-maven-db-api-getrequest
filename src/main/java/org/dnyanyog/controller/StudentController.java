package org.dnyanyog.controller;

import java.util.List;

import org.dnyanyog.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Student")
public class StudentController {
	
	@GetMapping("/full_name")
	public List<String> getDetails(){
		return new StudentService().getFullName();
	}

}
