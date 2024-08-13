package com.pooja;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Data
//@Table(name = "adit_st")
@Table
public class Student {
	
	
@Id
@Column(name="Name")
String name;
@Column
String mail;
@Column
String city;
@Column
String phone;

}
