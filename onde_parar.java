package onde_parar;
import java.util.Scanner;
public class onde_parar {

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		//Colocando vari�veis
		int idoso,gestante,deficiente;
		//Perguntando se � idoso ou n�o
		System.out.printf("Se voce for idoso(a) digite 0, se nao for digite 9:\n");
		idoso=ler.nextInt(); 
		//Perguntando se � gestante ou n�o
		System.out.printf("Se voce for gestante digite 1, se nao for digite 9:\n");
		gestante=ler.nextInt();
		//Perguntando se � deficiente fisico ou n�o
		System.out.printf("Se voce for deficiente fisico(a) digite 2, se nao for digite 9:\n");
		deficiente=ler.nextInt();
		//Fazendo condi��es para informar se pode ou n�o parar nas vagas
		if (idoso==0) {
			System.out.printf("Voce pode parar na vaga exclusiva para idoso(a)");
		}
			else if (gestante==1)
				System.out.printf("Voce pode parar na vaga exclusiva para gestantes");
			else if (deficiente==2)
				System.out.printf("Voce pode parar na vaga exlcusiva para deficiente fisico(a)");
		}
	}


