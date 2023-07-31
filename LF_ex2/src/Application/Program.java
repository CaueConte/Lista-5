package Application;
import java.util.Locale;
import java.util.Scanner;
import Entities.Salary;
public class Program {
	public static void main(String[] args) {
		//ler nome, salario bruto e imposto
		//mostrar dados do funcionario(nome e salario liquido)
		//aumentar o salario com base em uma porcentagem dada(somente bruto)
		//-name string
		//grosssalary double
		//tax double
		//+netsalary double
		//IncreaseSalary double
		
		System.out.println("ola");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Salary salary = new Salary();
		System.out.println("Enter the name: ");
		salary.name = sc.nextLine();
		System.out.println("Enter the Salary: ");
		salary.salary = sc.nextDouble();
		System.out.println("Enter the tax: ");
		salary.tax = sc.nextDouble();
		System.out.println("Employee: "+ salary.name+" $"+salary.NetSalary());
		System.out.println("Enter the percentage to increase: ");
		Double percentage = sc.nextDouble();
		salary.IncreaseSalary(percentage);
		System.out.println(salary);
		
		
	}

}
