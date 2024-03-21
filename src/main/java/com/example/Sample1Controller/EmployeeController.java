package com.example.Sample1Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Sample1.Employee;
import com.example.Sample1Repo.EmployeeRepository;

@RestController
@RequestMapping("/employ")
public class EmployeeController {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	@PostMapping
	public ResponseEntity<Employee> saveStudent(@RequestBody Employee employee)
	{
		employeeRepository.save(employee);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(employee);
		
		
	}

		 
	

}
