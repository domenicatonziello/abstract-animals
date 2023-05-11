package org.java.animal;

public class Main {
	 public static void main(String[] args) {
		Cane animale1 = new Cane();
		Passerotto animale2 = new Passerotto();
		Aquila animale3 = new Aquila();
		Delfino animale4 = new Delfino();
		
		Animale[] listaAnimali = {animale1, animale2, animale3, animale4};
		
		for(int i = 0; i < listaAnimali.length; i++) {
			listaAnimali[i].dormi();
			listaAnimali[i].verso();
			listaAnimali[i].mangia();
			System.out.println("-------------------------");
		}
	}
}
