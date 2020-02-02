package behavioral.observer;

public class StatisticsDisplay implements Observer, DisplayElement {
	private double maxTemp = 0.0f;
	private double minTemp = 200;
	private double tempSum= 0.0f;
	private int numReadings;
	private WeatherData weatherData;

	public StatisticsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	public void update(double temp, double humidity, double pressure) {
		tempSum += temp;
		numReadings++;

		if (temp > maxTemp) {
			maxTemp = temp;
		}
 
		if (temp < minTemp) {
			minTemp = temp;
		}

		display();
	}

	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
			+ "/" + maxTemp + "/" + minTemp);
	}

}
