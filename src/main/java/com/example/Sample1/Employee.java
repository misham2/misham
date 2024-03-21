package com.example.Sample1;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Employee {
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 private int empId;
	 private String name;
	 private int number;
	 
	 public int getEmpId() 
	 {
		return empId;
	 }
	public void setEmpId(int empId) 
	{
		this.empId = empId;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getNumber() 
	{
		return number;
	}
	public void setNumber(int number) 
	{
		this.number = number;
	}
	
	 
	

}
