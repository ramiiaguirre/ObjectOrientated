package ej16;

import java.util.List;

public class PromedioDecorator extends DataDisplayDecorator {

	public PromedioDecorator(WeatherData data) {
		super(data);
		// TODO Auto-generated constructor stub
	}
	
	 private double calcularPromedioTemperatura() {
	    List<Double> temperatures = super.getTemperaturas();
	    double sum = 0.0;
	    for (double temperature : temperatures) {
	        sum += temperature;
	    }
	    return sum / temperatures.size();
	 }

	@Override
	public String displayData() {
		return super.displayData() + "Promedio: " + this.calcularPromedioTemperatura() + "; ";
		
	}

}
