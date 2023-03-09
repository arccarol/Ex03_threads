package controller;

public class Ex03_threads extends Thread{
	
	private String nome;
	private int Dpercorrida = 0;
	private int Dtotpercorrida;
	private int pulo = 0;
	private int npulos = 0;
	private static int colocacao = 0;
	private final static int pulomaximo = 10;
	
	public Ex03_threads(String nome, int Dtotpercorrida) {
		this.Dtotpercorrida = Dtotpercorrida;
		this.nome = nome;
		this.Dtotpercorrida = Dtotpercorrida;
	}
	
		
	public void mostrasit() {
		System.out.println("O " +nome +" pulou " +pulo +" cm e percorreu " + Dpercorrida +" cm "); 
		 
	}	
	
	public void sapopulando() {
		npulos++;
		pulo = (int) (Math.random()* pulomaximo);
		Dpercorrida = Dpercorrida + pulo;
		
		if(Dpercorrida > Dtotpercorrida) {
			Dpercorrida = Dtotpercorrida;
		}
	}
	
	public void sapostop() {
		yield();
	}

	public void colocacaocorrida() {
		colocacao++;
		System.out.println("\n" +nome +" foi o " +colocacao +" colocado com: " +npulos +" pulos ");
	
	}
	
	public void run() {
		while (Dpercorrida < Dtotpercorrida) {
			sapopulando();
			mostrasit();
			sapostop();
			
			
			 try {
				 sleep(200);
			 }catch (InterruptedException e) {}
		}
				 try {
					 sleep(200);
				 }catch (InterruptedException e) {}
				 colocacaocorrida();
		 }
	
	}