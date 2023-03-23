package com.capsteam.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "games")
public class GameModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "platform")
    private String platform;
    @Column(name = "year")
    private String year;
    @Column(name = "genre")
    private String genre;
    @Column(name = "publisher")
    private String publisher;
    @Column(name = "nasales")
    private String na_sales;
    @Column(name = "eusales")
    private String eu_sales;
    @Column(name = "jpsales")
    private String jp_sales;
    @Column(name = "othersales")
    private String other_sales;
    @Column(name = "globalsales")
    private String global_sales;
    
	public GameModel(String name, String platform, String year, String genre, String publisher, String na_sales,
			String eu_sales, String jp_sales, String other_sales, String global_sales) {
		super();
		this.name = name;
		this.platform = platform;
		this.year = year;
		this.genre = genre;
		this.publisher = publisher;
		this.na_sales = na_sales;
		this.eu_sales = eu_sales;
		this.jp_sales = jp_sales;
		this.other_sales = other_sales;
		this.global_sales = global_sales;
	}
    
    
}

