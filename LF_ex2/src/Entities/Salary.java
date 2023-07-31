package Entities;

public class Salary {
	public String name;
	public double salary;
	public double tax;
	
	
	
	public double NetSalary() {
		return salary - tax;
	}
	
	public void IncreaseSalary(double percentage) {
		percentage = percentage /100;
		this.salary = (salary * percentage)+ salary - tax;
	}
	
	public String toString() {
		return "Employee: "+name+ " $"+salary;
	}
	
	

}
