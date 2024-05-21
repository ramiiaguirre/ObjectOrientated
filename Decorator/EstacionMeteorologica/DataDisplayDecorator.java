package ej16;

import java.util.List;

public class DataDisplayDecorator implements WeatherData{

	WeatherData data;
	
	public DataDisplayDecorator(WeatherData data) {
		this.data = data;
	}
	
	@Override
	public String displayData() {
		return this.data.displayData();
	}

	@Override
	public double getTemperatura() {
		return this.data.getTemperatura();
	}

	@Override
	public double getPresion() {
		return this.data.getPresion();
	}

	@Override
	public double getRadiacionSolar() {
		return this.data.getRadiacionSolar();
	}

	@Override
	public List<Double> getTemperaturas() {
		return this.data.getTemperaturas();
	}

}
