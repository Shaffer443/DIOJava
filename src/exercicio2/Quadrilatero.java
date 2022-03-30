package exercicio2;


public class Quadrilatero {
			
	
		double ll;
			
		
		public void area(double lado) {
			
			ll = lado + lado;
			
			System.out.println("Área do Quadrado  " + ll);
		
		}
		
		public void area(double lado1, double lado2) {
			
			ll = lado1 * lado2;
			
			System.out.println("Área do Retângulo  " + ll);
		
		}
		
		public void area(double baseMaior, double baseMenor, double altura) {
			
			ll = ((baseMaior + baseMenor) * altura)/2;
			
			System.out.println("Área do Trapézio  " + ll);
		
		}
	
	
	
}

