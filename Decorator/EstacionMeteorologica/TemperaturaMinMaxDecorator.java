package ej16;

public class TemperaturaMinMaxDecorator extends DataDisplayDecorator {

	private double minTemp = Double.MAX_VALUE;
    private double maxTemp = Double.MIN_VALUE;
    
	public TemperaturaMinMaxDecorator(WeatherData data) {
		super(data);		
		for (double temp : data.getTemperaturas()) {
            minTemp = Math.min(minTemp, temp);
            maxTemp = Math.max(maxTemp, temp);
        }
	}
	
	@Override
	public String displayData() {
		return super.displayData() + "Mínimo: " + this.minTemp + "; Máximo: " + this.maxTemp + "; ";
	}

}
