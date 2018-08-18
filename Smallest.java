public class Smallest {
   public static void main (String [] args) {
  
		long base;
		
	        for (base = 1; base <= 300000000; base++) {
				
	           int a = 0;
			   for (int cont = 1; cont <= 20; cont++){
					 
				 if (base % cont == 0){
				    a = (a+1);
				 } 
					 
			   }

	     	     if (a == 20){
		    	 System.out.println(base);
				 System.exit(0);
                 } 
            }
        
		//232792560
    }				
	  		
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
