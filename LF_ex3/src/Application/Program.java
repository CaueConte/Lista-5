package Application;
import java.util.Locale;
import java.util.Scanner;
import entities.Aluno;
public class Program {
	public static void main(String[] args) {
		System.out.println("ola");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno notas = new Aluno();
		System.out.println("Nome: ");
		notas.nome = sc.nextLine();
		System.out.println("Entre com as notas");
		notas.trimestreA = sc.nextDouble();
		notas.trimestreB = sc.nextDouble();
		notas.trimestreC = sc.nextDouble();
		System.out.println(notas.imprimir());
	}

}
