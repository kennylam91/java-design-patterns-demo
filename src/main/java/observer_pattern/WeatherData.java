package observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

	private float temperature;

	private float humidity;

	private float pressure;

	List<Observer> observers;

	public WeatherData() {
		super();
		observers = new ArrayList<>();
	}

	public void setMeasurements(float temp, float humidity, float press) {
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = press;
	}

	public void measurementsChanged() {
		notifyObservers();
	}

	public void registerObserver(Observer o) {
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		int index = observers.indexOf(o);
		if (index > -1) {
			observers.remove(index);
		}
	}

	public void notifyObservers() {
		observers.forEach(ob -> {
			ob.update(temperature, humidity, pressure);
		});

	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}

}
