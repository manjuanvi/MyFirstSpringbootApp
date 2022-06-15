package com.demo.emp;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/emp")
public class EmployController {

	Logger logger = LoggerFactory.getLogger(EmployController.class);

	@Autowired
	private EmployService employService;

	@GetMapping("/employs")
	public List<Employ> getAllEmployes() {
		
		logger.info("Inside EmployController getAllEmployes()");
		return employService.getAllEmploys();
	}

	@GetMapping("/employs/{id}")
	public Optional<Employ> getEmploy(@PathVariable String id) {
		logger.info("Inside EmployController getEmploy()");
		return employService.getEmploy(id);

	}

	@PostMapping ("/employs")
	public Employ addEmploy(@RequestBody Employ employ) {
		logger.info("Inside EmployController addEmploy()");
		return employService.addEmploy(employ);
	}

	@PutMapping("/employs/{id}")
	public void updateEmploys(@RequestBody Employ employ, @PathVariable String id) {
		logger.info("Inside EmployController updateEmploys()");
		employService.updateEmploy(employ, id);
	}

	@DeleteMapping("/employs/{id}")
	public void deleteEmploy(@PathVariable String id) {
		logger.info("Inside EmployController deleteEmploy()");
		employService.deleteEmploy(id);
	}

}
