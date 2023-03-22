package com.capsteam.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "games")
public class GameModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "platform")
	private String platform;
	@Column(name = "year")
	private int year;
	@Column(name = "genre")
	private String	genre;
	@Column(name = "publisher")
	private String publisher;
	@Column(name = "nasales")
	private int na_sales;
	@Column(name = "eusales")
	private int eu_sales;
	@Column(name = "jpsales")
	private int jp_sales;
	@Column(name = "othersales")
	private int other_sales;
	@Column(name = "globalsales")
	private int global_sales;
}
