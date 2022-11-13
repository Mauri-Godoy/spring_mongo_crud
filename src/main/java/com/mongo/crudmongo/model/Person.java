package com.mongo.crudmongo.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Document(collection = "person")
public class Person {

	@Id
//	@Field("_id") // Esto es para que el id no se genere automatico
	private String id;
	private String name;
	private String lastName;
	private Integer age;
	private Date dateCreated;
}
