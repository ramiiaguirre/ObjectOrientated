package ej6;

public abstract class Topografia {
	
	public abstract double getProporcionAgua(); 
	
	public double getProporcionTierra() {
		return 1 - this.getProporcionAgua();
	}
	
	@Override
	public boolean equals(Object obj) {
		Topografia topografia = (Topografia)obj;
		return this.getProporcionAgua() == topografia.getProporcionAgua();
	}
}
