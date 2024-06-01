package ej19;

public class FabricaGuerrero implements FabricaPersonaje {

	@Override
	public Personaje crearPersonaje() {
		return new Guerrero(new ArmaEspada(), new ArmaduraAcero());
	}

}
