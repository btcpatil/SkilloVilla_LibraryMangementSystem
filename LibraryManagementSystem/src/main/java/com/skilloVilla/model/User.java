package com.skilloVilla.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;
	private String firstName;
	private String lastName;
	private String address;
	private String phoneNumber;
	private String userEmail;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL)
	private List<Book> bookList;
}
