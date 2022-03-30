package teste;

import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Double;


public class Desafio1 {
		
	    public static void main(String[] args) throws IOException {
			//complete os espaços com sua solução
	    Scanner leitor = new Scanner(System.in);
			int N = leitor.nextInt();
			int X, Y;
			for (int i = 0; i < N; i++) {
				X = leitor.nextInt();
				Y = leitor.nextInt();
				
				if (Y == 0) System.out.println("divisao impossivel");
				else {
				  double operation = (double) X / (double) Y;
				  String result = new DecimalFormat("#.#").format(operation);
				  if(operation == 0d) {
					  System.out.println(0.0d);
				  } else {
					  System.out.println(Double.parseDouble(result));
				  }
				}
			}
	    }
		
}

