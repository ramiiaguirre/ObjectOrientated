package ej19;

public class FabricaThoor implements FabricaPersonaje {

	@Override
	public Personaje crearPersonaje() {
		return new Thoor(new ArmaMartillo(), new ArmaduraHierro());
	}
	
}
