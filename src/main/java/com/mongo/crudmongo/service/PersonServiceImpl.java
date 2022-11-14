package com.mongo.crudmongo.service;

import java.util.Date;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mongo.crudmongo.constant.ConstantPerson;
import com.mongo.crudmongo.converter.PersonConverter;
import com.mongo.crudmongo.dto.PersonDto;
import com.mongo.crudmongo.model.Person;
import com.mongo.crudmongo.repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepository personRepository;

	@Autowired
	private PersonConverter personConverter;

	@Override
	public ResponseEntity<String> create() {

		Random r = new Random();

		String name = ConstantPerson.NAMES[r.nextInt(9)];
		String lastName = ConstantPerson.LAST_NAMES[r.nextInt(9)];

		Person person = new Person(null, name, lastName, r.nextInt(50), new Date());

		personRepository.save(person);

		return new ResponseEntity<>(HttpStatus.OK);
	}

	@Override
	public List<PersonDto> getAll() {

		return personConverter.toDtoList(personRepository.findAll());
	}

	@Override
	public List<PersonDto> getByAge(int age) {

		return personConverter.toDtoList(personRepository.findByAge(age));
	}

	@Override
	public List<PersonDto> getByDate(Date dateFrom, Date dateTo) {

		return personConverter.toDtoList(personRepository.findByDate(dateFrom, dateTo));
	}

	@Override
	public List<PersonDto> getByName(String name) {

		return personConverter.toDtoList(personRepository.findByName(name));
	}
}
