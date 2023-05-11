package org.java.animal;

public class Delfino extends Animale implements Nuotante{

	@Override
	public void verso() {
		System.out.println("vocalizzi");
		
	}

	@Override
	public void mangia() {
		System.out.println("acciughe - sardine - aringhe");
		
	}

	@Override
	public void nuota() {
		System.out.println("Sto nuotando");
		
	}

}
