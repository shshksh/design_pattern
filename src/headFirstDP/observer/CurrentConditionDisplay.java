package headFirstDP.observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {

	private double temperature;
	private double humidity;
	private Subject weatherData;
	
	public CurrentConditionDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}
	
	@Override
	public void update(double temp, double humidity, double pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		display();
	}

	@Override
	public void display() {
		System.out.println("Current Conditions: "+temperature + "F degrees and " + humidity + "% humidity");
	}
	
}
