package com.capsteam.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Setter
@Getter
@Builder
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

}