package ej19;

public class FabricaMago implements FabricaPersonaje {

	@Override
	public Personaje crearPersonaje() {
		return new Mago(new ArmaBaston(), new ArmaduraCuero());
	}

}
