import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		
		int num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		  boolean continuar = true;
		  
		    while (continuar) {
		    	
		    	System.out.println("Digite um número: ");
				num = scanner.nextInt();
				
				if (num % 2 == 0) {
					
					System.out.println("Par");
					
				}else {
					System.out.println("impar");
				}
				
				
				
				System.out.println("Deseja continuar? (s/n)");
		    			String resposta = scanner.next();
		    			
		    			if(resposta.equalsIgnoreCase("N") ) {
		    				continuar = false;
		    			}
		    			
		    			
		    
		    }
		     System.out.println( "Obrigado, Ate logo!");
		         
		    		
			
				
				
				
				}
		  
		
		

	}


