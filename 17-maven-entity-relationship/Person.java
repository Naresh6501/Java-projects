package com.zensar.bean.pack1;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;


import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Person {
 @Id

 int personId;
 @Column
 String personName;
 @Column
 LocalDate dateOfBirth;
 @Column
 char gender;
 @OneToOne(mappedBy="person",cascade=CascadeType.ALL)
 @PrimaryKeyJoinColumn
 ContactInfo contactInfo;//one-to-one connection

public int getPersonId() {
	return personId;
}

public void setPersonId(int personId) {
	this.personId = personId;
}

public String getPersonName() {
	return personName;
}

public void setPersonName(String personName) {
	this.personName = personName;
}

public LocalDate getDateOfBirth() {
	return dateOfBirth;
}

public void setDateOfBirth(LocalDate dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}

public char getGender() {
	return gender;
}

public void setGender(char gender) {
	this.gender = gender;
}

public ContactInfo getContactInfo() {
	return contactInfo;
}

public void setContactInfo(ContactInfo contactInfo) {
	this.contactInfo = contactInfo;
}

public Person() {
	super();
}

public Person(int personId, String personName, LocalDate dateOfBirth, char gender, ContactInfo contactInfo) {
	super();
	this.personId = personId;
	this.personName = personName;
	this.dateOfBirth = dateOfBirth;
	this.gender = gender;
	this.contactInfo = contactInfo;
}

@Override
public String toString() {
	return "Person [personId=" + personId + ", personName=" + personName + ", dateOfBirth=" + dateOfBirth + ", gender="
			+ gender + ", contactInfo=" + contactInfo + "]";
}
 
}
