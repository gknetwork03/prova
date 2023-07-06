import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		float nota1, nota2, nota3, nota4 = 0;
		int cont = 1;
		float media = 0;
		float soma = 0;
		float mMaior = 0 ;
		float mMenor = 0 ;
		
		
	Scanner lerNotas = new Scanner(System.in);
	
	  
	
	  for (cont = 1; cont <=10; cont++) {
		  System.out.println("Digite a nota " + cont + "o. aluno");
		  
		 System.out.println("Digite 1 nota:");
		  		nota1 = lerNotas.nextFloat();
	     System.out.println("Digite  2 nota:");
	     nota2 = lerNotas.nextFloat();
	     System.out.println("Digite  3 nota:");
	     nota3 = lerNotas.nextFloat();
	     System.out.println("Digite  4 nota:");
	     nota4 = lerNotas.nextFloat();
	     
		 soma = (nota1+nota2+nota3+nota4) /4;
		  
		   System.out.println(" A média do aluno é: " + soma);
		    	 
		   
		   
		   if(soma >= 5) {
			    System.out.println("Aprovado" );
			    mMaior = mMaior + 1;
			    
		   }else {
			   System.out.println("reprovado"  );
			   mMenor = mMenor + 1;
			   media = soma/10;
			  
		   }
		   
		       
		   }
	  		System.out.println("A média da média é: " + media);
		    System.out.println("A Média maior: " + mMaior);
		    System.out.println("A Média menor: " + mMenor);
		  
		  
		  
	  
	  return;
	
	 
	

	}

}
