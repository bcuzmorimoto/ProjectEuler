import java.util.Scanner;
    public class PrimoSeq {
         public static void main (String [] args){
          
		 Scanner input = new Scanner (System.in);
		 
		 int cont = 0, primo = 0;
		 
		    for (int div = 1; div <= 100000; div++){
		         for (int valor = 1; valor <= 10; valor++) {
					
					if (div % valor == 0) {
					cont = (cont + 1);
					}
					if (cont == 2){
						primo = primo++;
						System.out.println(div);
					}
					
				 }
					if (primo == 6){
						System.out.println(primo);
					}
			 }
			 
		 }
	}