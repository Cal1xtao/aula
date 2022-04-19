package auto_escola;
import java.util.Scanner;
public class auto_escola {

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		//Colocando variáveis
		int psico, p1, exame;
		//Perguntando se passou no teste psicologico
		System.out.printf("Se voce passou no teste psicologico digite 0, se nao passou digite 9:\n");
		psico=ler.nextInt(); 
		//Perguntando se passou na prova de legislação
		System.out.printf("Se voce passou na prova de legislação digite 1, se nao passou digite 9:\n");
		p1=ler.nextInt();
		//Perguntando se passou no exame prático
		System.out.printf("Se voce for deficiente fisico(a) digite 2, se nao for digite 9:\n");
		exame=ler.nextInt();
		int soma;
		soma=psico+p1+exame;
		//Fazendo condições para informar se está apto na auto escola ou não
		if (soma==3)
			System.out.printf("Voce esta apto na auto escola, parabens");
		else
			System.out.printf("Voce nao esta apto na auto escola");
			
		

	}

}
