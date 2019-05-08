package com.cg.bean;

import java.time.LocalDate;

public class Employee {
private int empId;
private String name;
private String location;
private double salary;
private LocalDate joinDate;
private boolean married;

public Employee() {
	super();
}

public Employee(int empId, String name, String location, double salary, LocalDate joinDate) {
	this.empId = empId;
	this.name = name;
	this.location = location;
	this.salary = salary;
	this.joinDate = joinDate;
}

public int getEmpId() {
	return empId;
}

public void setEmpId(int empId) {
	this.empId = empId;
}

public Employee(int empId, String name, String location, double salary) {
	super();
	this.empId = empId;
	this.name = name;
	this.location = location;
	this.salary = salary;
}

public boolean isMarried() {
	return married;
}

public void setMarried(boolean married) {
	this.married = married;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

public LocalDate getJoinDate() {
	return joinDate;
}

public void setJoinDate(LocalDate joinDate) {
	this.joinDate = joinDate;
}

@Override
public String toString() {
	return "Employee [empId=" + empId + ", name=" + name + ", location=" + location + ", salary=" + salary
			+ ", joinDate=" + joinDate + "]";
}



}
