package desafio01;

import java.util.Scanner;

public class Processo {
	
	//Scanner input = new Scanner(System.in);
	//int km = input.nextInt();
	
	// achie a matrix dada pela quest�o:
	public void base() {
			int minutos = 2;
			for(int y=1; y <=30; y++ ) {
				
				System.out.println("Dist�ncia entre Y para X: " + y);
				System.out.println("Minutos onde Y chega a 30km de dit�ncia: " + minutos);
				minutos += 2;
				
				
			}

	}
	
	public void resultado() {
		
		
		
		
		int minutos = 1;
		for(double y=1.5 ; y <= 30; y+=1.5 ) {
			
			System.out.println("Dist�ncia entre Y para X: " + y);
			System.out.println("Minutos onde Y chega a 30km de dit�ncia: " + minutos + "minutos");
			minutos += 1;
			
			
		}
		
		
	}

}
