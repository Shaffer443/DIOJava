#Sistema de Comprimento

Premissa do sistema � atrav�s das horas, comprimentar entre "Bom Dia", "Boa Tarde", "Boa Noite".

**Passo a Passo:**

1� atrav�s da import��o da biblioteca LocalTime, temos acesso aos metodos que ajudam a retirar hora, dia, data e outros.

_import java.time.LocalTime;_

2� Atrav�s do do m�todo (LocalTime.now();), conseguimos retirar a hora do sistema no momento em que rodar o script.

_ LocalTime hora = LocalTime.now();_

3� O sistema retornar� em uma formata��o n�o muito atrativa para o que quero no programa.

<mark>Exemplo:</mark>

_20:33:48.217757_

4� Formatarei atrav�s do comando _DateTimeFormatter_, atrav�s da importa��o da biblioteca

 _ import java.time.format.DateTimeFormatter;_
 
4.1� Atrav�s de um comando um pouco longo, podemos formatar do modo que quiseremos atrav�s da fun��o:
 
 _DateTimeFormatter formatadortime = DateTimeFormatter.ofPattern("HH:mm:ss");_
 
4.2� Formatei na condi��o de apenas pegar as horas:

_DateTimeFormatter pegandoahora = DateTimeFormatter.ofPatter("HH");_ 
 
5� Passei o resulrado para um vari�vel:

_String agora = hora.format(pegandoahora);_

<mark>OBS:</mark> N�o consegui colcoar o tipo da vari�vel como <kbd>int</kbd>, e isso me fez escrever bastante c�digo como String.

6� �ltimo passo, passar um <cite>If/Else</cite> com as impress�es atrav�s do _System.out_ e rodar o sistema.

String agora = hora.format(pegandoahora);
		
		
		
		if(agora == "00" || agora == "01" ||agora == "02" ||agora == "03" ||agora == "04" ||agora == "05" ||agora == "06" ||agora == "07" ||agora == "08" ||agora == "09" ||agora == "10" ||agora == "11" ) {
			
			System.out.println("Bom dia");
			
		}else if(agora == "12" || agora == "13" ||agora == "14" ||agora == "15" ||agora == "16" ||agora == "17"  ) {
			
			System.out.println("Boa Tarde");
		
		}else {
			
			System.out.println("Boa Noite");
			
		}


