package view;

import controller.Ex03_threads;

public class Principal{
	 final static int n_sapos= 5;
	 final static int distancia = 200;

	public static void main(String args[]) {
		
		Ex03_threads thread03;
		
		System.out.println("Corrida dos sapos:");
		
		for(int i = 1; i<= n_sapos; i++) {
			
			thread03 = new Ex03_threads(" sapo " +i, distancia);
			thread03.start();
			
		}
	}
}

