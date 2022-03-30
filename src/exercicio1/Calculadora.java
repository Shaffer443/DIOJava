package exercicio1;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		int n1, n2;
		int operacao;
		int soma;
		int subtracao;
		int multiplicacao;
		int divisao;
		
		Scanner teclado = new Scanner(System.in);
		
		
			
			System.out.println("Digite um numero");
			n1 = teclado.nextInt();
			System.out.println("Digite a operação:");
			System.out.println(" 1 - Soma");
			System.out.println(" 2 - Subtração");
			System.out.println(" 3 - Multiplicação");
			System.out.println(" 4 - Divisão ");
			operacao = teclado.nextInt();
			System.out.println("Digite um numero");
			n2 = teclado.nextInt();
		
			soma = n1 + n2; 
			subtracao = n1 - n2;
			multiplicacao = n1 * n2; 
			divisao = n1 / n2; 
			
			if(operacao == 1) { 
				
				//System.out.println(soma);
				System.out.println();
				System.out.printf("Multiplicando %d x %d = %d", n1,n2,soma);
				
			}else if(operacao == 2 ) {
				
				//System.out.println(subtracao);
				System.out.println();
				System.out.printf("Multiplicando %d x %d = %d", n1,n2,subtracao);
		
			}else if(operacao == 3 ) {
				
				//System.out.println(multiplicacao);
				System.out.println();
				System.out.printf("Multiplicando %d x %d = %d", n1,n2,multiplicacao);
				
			}else if(operacao == 4 ) {
			
				//System.out.println(divisao);
				System.out.println();
				System.out.printf("Multiplicando %d x %d = %d", n1,n2,divisao);
			
			}
			
			
				
		}
		
		
		
}