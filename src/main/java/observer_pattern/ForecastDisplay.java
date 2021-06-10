package observer_pattern;

public class ForecastDisplay implements Observer, DisplayElement {

	private float temp;

	private float humidity;

	private float pressure;

	@Override
	public void display() {
		System.out.println(toString());
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temp = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
	}

	@Override
	public String toString() {
		return "ForecaseDisplay [temp=" + temp + ", humidity=" + humidity + ", pressure=" + pressure + "]";
	}

}
