package com.cg.payroll.beans;

public class CgEmployee {

	
      private int id;
     private String firstName, lastName, pancard, designation, department;
     private BankDetails bankdetails;
     private Salary salary;
     
     public CgEmployee() {}

     
	public CgEmployee(int id, String firstName, String lastName, String pancard, String designation, String department,
			BankDetails bankdetails, Salary salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.pancard = pancard;
		this.designation = designation;
		this.department = department;
		this.bankdetails = bankdetails;
		this.salary = salary;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPancard() {
		return pancard;
	}
	public void setPancard(String pancard) {
		this.pancard = pancard;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}


	public BankDetails getBankdetails() {
		return bankdetails;
	}


	public void setBankdetails(BankDetails bankdetails) {
		this.bankdetails = bankdetails;
	}


	public Salary getSalary() {
		return salary;
	}


	public void setSalary(Salary salary) {
		this.salary = salary;
	}
	
	}


