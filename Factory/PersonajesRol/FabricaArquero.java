package ej19;

public class FabricaArquero implements FabricaPersonaje {

	@Override
	public Personaje crearPersonaje() {
		return new Arquero(new ArmaArco(), new ArmaduraCuero());
	}

}
