import java.util.Scanner;
    public class Largest {
        public static void main (String [] args){
          
		Scanner input = new Scanner (System.in);
		 
		    long valor = 13195;
			int maior = 2, cont = 0, primo = 0;
			
			//  2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73//
			
			for (int number = 2; number <= 5; number++){
			   for (int i= 2; i <= number; i++){
				   if ((number % i == 0) && (i == number)){
					   continue;
				   } else{
					   primo = number;
				   }
				   System.out.println(primo);
			   }
			}
			
			System.out.println("Maior primo: " + maior);
		 
		}
	}