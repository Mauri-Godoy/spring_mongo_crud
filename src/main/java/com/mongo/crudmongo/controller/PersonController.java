package com.mongo.crudmongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.crudmongo.dto.PersonDto;
import com.mongo.crudmongo.service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	private PersonService personService;

	@PostMapping()
	public ResponseEntity<String> create() {
		return personService.create();
	}

	@GetMapping()
	public List<PersonDto> getAll() {
		return personService.getAll();
	}

	@GetMapping("/age")
	public List<PersonDto> getByAge(@RequestParam int age) {
		return personService.getByAge(age);
	}
}
