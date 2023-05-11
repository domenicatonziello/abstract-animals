package org.java.animal;

public class Passerotto extends Animale implements Volante{
	
	
	@Override
	public void verso() {
		System.out.println("cinguettare");;
	}
	@Override
	public void mangia() {
		System.out.println("erba - insetti");
	}
	@Override
	public void vola() {
		System.out.println("Sto volando");
		
	}
	

}
