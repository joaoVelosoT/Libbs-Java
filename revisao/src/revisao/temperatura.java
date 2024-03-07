package revisao;

import java.util.Scanner;

public class temperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("teste");
		
		
		while (teclado.hasNext()) {
			if(teclado.hasNextDouble()) {
				double numero = teclado.nextDouble();
				
				System.out.println("numero: "+numero);
			}else {
				break;
			}
		}
		
	}

}
 