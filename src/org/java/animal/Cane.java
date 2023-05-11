package org.java.animal;

public class Cane extends Animale implements Nuotante{

	@Override
	public void verso() {
		System.out.println("abbaiare");
		
	}

	@Override
	public void mangia() {
		System.out.println("crocchette");
		
	}

	@Override
	public void nuota() {
		System.out.println("Sto nuotando");
		
	}
	

}
