package com.capsteam.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
	@Column(name = "ranking")
	private int rank;
	@Column(name = "name")
	private String name;
	@Column(name = "platform")
	private String platform;
	@Column(name = "year")
	private int year;
	@Column(name = "genre")
	private String genre;
	@Column(name = "publisher")
	private String publisher;
	@Column(name = "nasales")
	private double na_sales;
	@Column(name = "eusales")
	private double eu_sales;
	@Column(name = "jpsales")
	private double jp_sales;
	@Column(name = "othersales")
	private double other_sales;
	@Column(name = "globalsales")
	private double global_sales;
	
	
	

	/*
	 * public int getId() { return id; } public void setId(int id) { this.id = id; }
	 * public String getName() { return name; } public void setName(String name) {
	 * this.name = name; } public String getPlatform() { return platform; } public
	 * void setPlatform(String platform) { this.platform = platform; } public int
	 * getYear() { return year; } public void setYear(int year) { this.year = year;
	 * } public String getGenre() { return genre; } public void setGenre(String
	 * genre) { this.genre = genre; } public String getPublisher() { return
	 * publisher; } public void setPublisher(String publisher) { this.publisher =
	 * publisher; } public int getNa_sales() { return na_sales; } public void
	 * setNa_sales(int na_sales) { this.na_sales = na_sales; } public int
	 * getEu_sales() { return eu_sales; } public void setEu_sales(int eu_sales) {
	 * this.eu_sales = eu_sales; } public int getJp_sales() { return jp_sales; }
	 * public void setJp_sales(int jp_sales) { this.jp_sales = jp_sales; } public
	 * int getOther_sales() { return other_sales; } public void setOther_sales(int
	 * other_sales) { this.other_sales = other_sales; } public int getGlobal_sales()
	 * { return global_sales; } public void setGlobal_sales(int global_sales) {
	 * this.global_sales = global_sales; } public GameModel() { super(); // TODO
	 * Auto-generated constructor stub }
	 */

}
