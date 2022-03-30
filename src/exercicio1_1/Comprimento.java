package exercicio1_1;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Comprimento {

	public static void main(String[] args) {
	
		
		
		
		LocalTime hora = LocalTime.now();
		
		System.out.println("Hora atual padrão:");		
		DateTimeFormatter formatadortime = DateTimeFormatter.ofPattern("HH:mm:ss");
				
				
		System.out.println(hora.format(formatadortime));

		
		// Tirando apenas a hora:
		
		DateTimeFormatter pegandoahora = DateTimeFormatter.ofPattern("HH");
		//System.out.println(hora.format(pegandoahora));
		 
		String agora = hora.format(pegandoahora);
		

		
		if(agora == "00" || agora == "01" ||agora == "02" ||agora == "03" ||agora == "04" ||agora == "05" ||agora == "06" ||agora == "07" ||agora == "08" ||agora == "09" ||agora == "10" ||agora == "11" ) {
			
			System.out.println("Bom dia");
			
		}else if(agora == "12" || agora == "13" ||agora == "14" ||agora == "15" ||agora == "16" ||agora == "17"  ) {
			
			System.out.println("Boa Tarde");
		
		}else {
			
			System.out.println("Boa Noite");
			
		}
		
		
		
		
		
	}

}
