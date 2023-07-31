package entities;

public class Aluno {
	public String nome;
	public double trimestreA;
	public double trimestreB;
	public double trimestreC;
	
	
	
	public double calculoNotaFinal() {
		return trimestreA+trimestreB+trimestreC;
		
	}
	
	public String imprimir(){
		double notaFinal = calculoNotaFinal();
		String aprovacao = "";
		if(notaFinal < 60) {
			aprovacao = "rodou";
		}
		else {
			aprovacao = "aprovado";
		}
		return "Nome: "+nome+" Nota final: "+notaFinal+" aprovacao: "+aprovacao;
		
	}
	

}
