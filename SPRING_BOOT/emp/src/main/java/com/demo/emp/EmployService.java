package com.demo.emp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployService {
	Logger logger = LoggerFactory.getLogger(EmployService.class);
	@Autowired
	private EmployRepository employRepository;
	
	
	public List<Employ> getAllEmploys() {
		logger.info("Inside EmployService getAllEmploys()");
		List<Employ> employs = new ArrayList<Employ>();
		employRepository.findAll().forEach(employs::add);
		return employs;

	}

	public Optional<Employ> getEmploy(String id) {
		logger.info("Inside EmployService getEmploy()");
		return employRepository.findById(id);
	}
	
	public Employ addEmploy(Employ employ) {
		logger.info("Inside  EmployService addEmploy()");
		return employRepository.save(employ);
	}

	public void updateEmploy(Employ employ, String id) {
		logger.info("Inside EmployService updateEmploy()");
		employRepository.save(employ);
	}

	public void deleteEmploy(String id) {
		logger.info("Inside EmployService deleteEmploy()");
		employRepository.deleteById(id);
	}
}
