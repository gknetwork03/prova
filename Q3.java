import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner corrida = new Scanner(System.in);
			
			double distancia = 0;
			int bandeira = 0;
			double vCorrida = 0.0;
			
			
			System.out.println("Digite a Distancia percorrida em KM: ");
			   distancia = corrida.nextDouble();
			System.out.println("Digite a bandeira 1 ou 2: ");
			   bandeira = corrida.nextInt();
			
			   if (bandeira == 1) {
				   vCorrida = distancia*1.80;
				   
				  
			   }else if(bandeira == 2) {
				   vCorrida = distancia*2.30;
				   
			   }else {
				   System.out.println("Bandeira inválida. Escolha 1 ou 2");
				   System.exit(0);
				   
			   }
			   System.out.println("O valor da corrida é: "+vCorrida);
	}

}
