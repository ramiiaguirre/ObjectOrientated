package ej16;

import java.util.List;
import java.util.ArrayList;

public class HomeWeatherStation implements WeatherData{
	
	//retorna la temperatura en grados Fahrenheit. 
	public double getTemperatura() {
		return 86.0;
	}

	//retorna la presión atmosférica en hPa
	public double getPresion() {
		return 1008;
	}

	//retorna la radiación solar
	public double getRadiacionSolar() {
		return 200.0;
	}

	
	public List<Double> getTemperaturas() {
		List<Double> data = new ArrayList<Double>();
		data.add(80.4);
		data.add(75.8);
		return data;
	}

	//retorna  un reporte de todos los datos: temperatura, presión, y radiación solar.
	public String displayData(){
		return "Temperatura F: " + this.getTemperatura() + "; " +
		   	  "Presión atmosf: " + this.getPresion() + "; " +
		   	  "Radiación solar: " + this.getRadiacionSolar() + "; ";
	}

}
