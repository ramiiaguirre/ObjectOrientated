package ej15;

public class TamanioDecorator extends FileDecorator {

	public TamanioDecorator(Manager manager) {
		super(manager);
	}
	
	@Override
	public String prettyPrint() {
		return super.prettyPrint() + " Tamanio: " + this.getTamanio() + ". ";
	}

}
