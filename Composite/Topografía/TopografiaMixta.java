package ej6;

import java.util.ArrayList;
import java.util.List;

public class TopografiaMixta extends Topografia {
	
	public List<Topografia> formaciones;

	public TopografiaMixta(Topografia t1, Topografia t2, 
			Topografia t3, Topografia t4) {
		formaciones = new ArrayList<Topografia>();
		formaciones.add(t1);
		formaciones.add(t2);
		formaciones.add(t3);
		formaciones.add(t4);
	}
	
	@Override
	public double getProporcionAgua() {
		return formaciones.stream()
				.mapToDouble(t -> t.getProporcionAgua())
				.sum() / 4;
	}
	
	@Override
	public boolean equals(Object obj) {
		TopografiaMixta topografia = (TopografiaMixta)obj;
		return this.formaciones.equals(topografia.formaciones);
	}
	
}
