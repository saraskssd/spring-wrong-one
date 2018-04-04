package com.springmvc.first.controller;

public class Employee {
	private int id;
	private String EmployeeName;
	private double EmployeeSalary;
	private String EmployeeDesignation;
	
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String employeeName, double employeeSalary, String employeeDesignation) {
		super();
		this.id = id;
		EmployeeName = employeeName;
		EmployeeSalary = employeeSalary;
		EmployeeDesignation = employeeDesignation;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public double getEmployeeSalary() {
		return EmployeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		EmployeeSalary = employeeSalary;
	}
	public String getEmployeeDesignation() {
		return EmployeeDesignation;
	}
	public void setEmployeeDesignation(String employeeDesignation) {
		EmployeeDesignation = employeeDesignation;
	}
	

}
