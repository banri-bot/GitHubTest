package com.example.app.domain;

import lombok.Data;

@Data
public class Book {

	private Integer id;
	private String name;
	private String author;
	private Integer price;
}
