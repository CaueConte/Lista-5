package Application;
import java.util.Scanner;
import java.util.Locale;
import entities.Calculator;
public class Program {
	public static void main(String[] args) {
		System.out.println("ola");
		//programa que le valores de altura e largura de um retangulo
		//mostra na tela area, perimetro e diagonal
		//width double
		//height double
		//+area double
		//+perimeter() double
		//+diagonal() double
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Calculator retangulo;
		retangulo = new Calculator();
		System.out.println("Type the width: ");
		retangulo.width = sc.nextDouble();
		System.out.println("Type the height: ");
		retangulo.height = sc.nextDouble();
		
		double areaRetangulo = retangulo.area();
		double perimeterRetangulo = retangulo.perimeter();
		double diagonalRetangulo = retangulo.diagonal();
		
		System.out.println("Area: "+areaRetangulo);
		System.out.println("Perimetro: "+perimeterRetangulo);
		System.out.println("Diagonal: "+diagonalRetangulo);
	}

}
