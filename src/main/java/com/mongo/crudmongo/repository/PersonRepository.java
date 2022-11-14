package com.mongo.crudmongo.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mongo.crudmongo.model.Person;

@Repository
public interface PersonRepository extends MongoRepository<Person, Integer> {

	@Query("{'age' : :#{#age}}")
	public List<Person> findByAge(@Param("age") int age);

	@Query("{'dateCreated' : { $gte: ?0, $lte: ?1 } }")
	public List<Person> findByDate(Date from, Date to);

	@Query("{'name': {$regex : /^?0/, $options: 'i' }}")
	public List<Person> findByName(String name);
}
