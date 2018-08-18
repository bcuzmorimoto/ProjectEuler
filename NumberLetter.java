import java.util.Scanner;
   public class NumberLetter {
       public static void main (String [] args) {
          
		   Scanner input = new Scanner (System.in);
		   
		   int numMax = 1000, soma = 0, somaFixa = 0, dezena, centena, somaA = 0;
		   char leitura;
		   float mult;
		   
		   System.out.println("Informe quantas dezenas há o numero limite.");
		   dezena = input.nextInt();
		   System.out.println("Informe quantas centena há o numero limite.");
		   centena = input.nextInt();
		   System.out.println();
		   
		   
		   System.out.println("Soletre a forma extensa dos numeros.");
		   System.out.println("Informe fim quando terminar o numero e desejar ir para o proximo.");
           System.out.println();
		   
		   // numeros bases de 1 até 9//
		   
		   for (int cont = 1; cont <= 9; cont ++) {
			  
			     do {
			     System.out.println("Soletre o " + cont + " numero.");
			     leitura = input.nextLine().charAt(0);
			  
			        if (leitura == 'z'){
              	        continue;
                    } else {
					    soma = (soma + 1);
				    }
				 
				 } while (leitura != 'z');
				 
		   } //fim do for //
		   
		   System.out.println("Do 1 ao 9 ha: " + soma + " letras.");
		   
		   // numeros bases 20 ao 90 passo 10//
		   for (int cont = 20; cont <= 90; cont = cont + 10) {
			  
			     do {
			     System.out.println("Soletre o " + cont + " numero.");
			     leitura = input.nextLine().charAt(0);
			  
			        if (leitura == 'z'){
              	        continue;
                    } else {
					    somaFixa = (somaFixa + 1);
				    }
				 
				 } while (leitura != 'z');
				 
		   } //fim do for //
		   
		   System.out.println("Do 20 ao 90 ha: " + somaFixa + " letras.");
		   
		   
		   // numeros bases 11 ao 19 //
		   for (int cont = 11; cont <= 19; cont++) {
			  
			     do {
			     System.out.println("Soletre o " + cont + " numero.");
			     leitura = input.nextLine().charAt(0);
			  
			        if (leitura == 'z'){
              	        continue;
                    } else {
					    somaA = (somaA + 1);
				    }
				 
				 } while (leitura != 'z');
				 
		   } //fim do for //
		   
		   System.out.println("Do 11 ao 19 ha: " + somaA + " letras.");
		   
		   
		   // base 11 ao 19 //
		  
		   mult = (soma * (dezena - 1)); // 1 a 9 * quantidad de dezenas //
		   mult = ((mult + soma) + (centena * somaFixa) + somaA);
		   System.out.println("Total: " + mult);
		   
       }
    }