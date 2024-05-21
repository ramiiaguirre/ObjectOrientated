package ej16;

import java.util.ArrayList;
import java.util.List;

public class TemperaturaCelciusDecorator extends DataDisplayDecorator {
	
	public TemperaturaCelciusDecorator(WeatherData data) {
		super(data);
	}

	@Override
	public String displayData() {
		return "Temperatura C: " + this.getTemperatura() + "; " +
		   	  "Presión atmosf: " + this.getPresion() + "; " +
		   	  "Radiación solar: " + this.getRadiacionSolar() + "; ";		
	}

	@Override
	public double getTemperatura() {
		// (ºC = (ºF-32) ÷ 1.8). 
		return (super.getTemperatura() - 32) / 1.8;
	}
	
	@Override
    public List<Double> getTemperaturas() {
        List<Double> fahrenheitTemperaturas = super.getTemperaturas();
        List<Double> celsiusTemperaturas = new ArrayList<>();
        for (double fahrenheit : fahrenheitTemperaturas) {
            double celsius = (fahrenheit - 32) / 1.8;
            celsiusTemperaturas.add(celsius);
        }
        return celsiusTemperaturas;
    }
}
