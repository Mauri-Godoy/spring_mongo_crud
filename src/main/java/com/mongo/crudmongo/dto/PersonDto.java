package com.mongo.crudmongo.dto;

import java.util.Date;

import lombok.Data;

@Data
public class PersonDto {
	private String id;
	private String name;
	private String lastName;
	private Integer age;
	private Date dateCreated;
}
