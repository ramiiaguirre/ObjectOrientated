package ej15;

public abstract class FileDecorator implements Manager {

	protected Manager manager;
	
	public FileDecorator(Manager manager) {
		this.manager = manager;
	}
	
	@Override
	public String getNombre() {
		return this.manager.getNombre();
	}
	
	@Override
	public String getExtension() {
		return this.manager.getExtension();
	}
	
	@Override
	public int getTamanio() {
		return this.manager.getTamanio();
	}
	
	@Override
	public String prettyPrint() {
		return this.manager.prettyPrint();
	}

}
