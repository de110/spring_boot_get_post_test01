package com.test.post01.Dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class BoardDto {
    @Id
    @GeneratedValue
    private Long id;
    private String age;
    private String name;

    // public BoardDto() {
    // }

    // public BoardDto(String name, String age) {
    // this.name = name;
    // this.age = age;
    // }
}