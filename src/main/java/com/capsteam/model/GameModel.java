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
	@Column(name = "Id")
	private int id;
	@Column(name = "Name")
	private String name;
	@Column(name = "Platform")
	private String platform;
	@Column(name = "Year")
	private int year;
	@Column(name = "Genre")
	private String	genre;
	@Column(name = "Publisher")
	private String publisher;
	@Column(name = "NA_Sales")
	private int na_sales;
	@Column(name = "EU_Sales")
	private int eu_sales;
	@Column(name = "JP_Sales")
	private int jp_sales;
	@Column(name = "Other_Sales")
	private int other_sales;
	@Column(name = "Global_Sales")
	private int global_sales;
}
