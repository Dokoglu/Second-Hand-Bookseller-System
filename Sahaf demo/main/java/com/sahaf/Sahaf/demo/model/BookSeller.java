package com.sahaf.Sahaf.demo.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookSeller {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name;
	private String surname;
	private int bookID;
	
	@OneToMany
	private List<Book> books;
	
	public BookSeller(int id, String name, String surname, int bookID) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.bookID=bookID;
	}
}
