package ej15;

public class NombreDecorator extends FileDecorator{

	public NombreDecorator(Manager manager) {
		super(manager);
	}

	@Override
	public String prettyPrint() {
		//return this.manager.prettyPrint() + this.manager.getNombre();
		return super.prettyPrint() + this.getNombre();
	}


}
