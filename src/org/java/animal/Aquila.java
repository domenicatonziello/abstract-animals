package org.java.animal;

public class Aquila extends Animale implements Volante{

	@Override
	public void verso() {
		System.out.println("strido");
		
	}

	@Override
	public void mangia() {
		System.out.println("mammiferi");
		
	}

	@Override
	public void vola() {
		System.err.println("Sto volando");
		
	}

	
}
