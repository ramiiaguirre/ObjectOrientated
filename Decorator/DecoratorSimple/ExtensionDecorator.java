package ej15;

public class ExtensionDecorator extends FileDecorator{

	public ExtensionDecorator(Manager manager) {
		super(manager);
	}

	@Override
	public String prettyPrint() {
		return super.prettyPrint() + this.getExtension();
	}

}
