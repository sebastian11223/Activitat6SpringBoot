package com.example.demo.entitats;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {
	@Id
	private int id;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String lastName;
	private String firsttName;
	private LocalDate birthDate;
	private boolean wantsNewsletter;
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirsttName() {
		return firsttName;
	}
	public void setFirsttName(String firsttName) {
		this.firsttName = firsttName;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	public boolean isWantsNewsletter() {
		return wantsNewsletter;
	}
	public void setWantsNewsletter(boolean wantsNewsletter) {
		this.wantsNewsletter = wantsNewsletter;
	}
	
	public Student(int id , String lastName, String firsttName, LocalDate birthDate, boolean wantsNewsletter) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.firsttName = firsttName;
		this.birthDate = birthDate;
		this.wantsNewsletter = wantsNewsletter;
	}
	
	
}
