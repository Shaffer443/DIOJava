#Sistema de Comprimento

Premissa do sistema é através das horas, comprimentar entre "Bom Dia", "Boa Tarde", "Boa Noite".

**Passo a Passo:**

1º através da importção da biblioteca LocalTime, temos acesso aos metodos que ajudam a retirar hora, dia, data e outros.

_import java.time.LocalTime;_

2º Através do do método (LocalTime.now();), conseguimos retirar a hora do sistema no momento em que rodar o script.

_ LocalTime hora = LocalTime.now();_

3º O sistema retornará em uma formatação não muito atrativa para o que quero no programa.

<mark>Exemplo:</mark>

_20:33:48.217757_

4º Formatarei através do comando _DateTimeFormatter_, através da importação da biblioteca

 _ import java.time.format.DateTimeFormatter;_
 
4.1º Através de um comando um pouco longo, podemos formatar do modo que quiseremos através da função:
 
 _DateTimeFormatter formatadortime = DateTimeFormatter.ofPattern("HH:mm:ss");_
 
4.2º Formatei na condição de apenas pegar as horas:

_DateTimeFormatter pegandoahora = DateTimeFormatter.ofPatter("HH");_ 
 
5º Passei o resulrado para um variável:

_String agora = hora.format(pegandoahora);_

<mark>OBS:</mark> Não consegui colcoar o tipo da variável como <kbd>int</kbd>, e isso me fez escrever bastante código como String.

6º Último passo, passar um <cite>If/Else</cite> com as impressôes através do _System.out_ e rodar o sistema.

String agora = hora.format(pegandoahora);
		
		
		
		if(agora == "00" || agora == "01" ||agora == "02" ||agora == "03" ||agora == "04" ||agora == "05" ||agora == "06" ||agora == "07" ||agora == "08" ||agora == "09" ||agora == "10" ||agora == "11" ) {
			
			System.out.println("Bom dia");
			
		}else if(agora == "12" || agora == "13" ||agora == "14" ||agora == "15" ||agora == "16" ||agora == "17"  ) {
			
			System.out.println("Boa Tarde");
		
		}else {
			
			System.out.println("Boa Noite");
			
		}


