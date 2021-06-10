package observer_pattern;

public class CurrentConditionDisplay implements Observer, DisplayElement {

	private float temperature;

	private float humidity;

	private float pressure;

	@Override
	public void display() {
		System.out.println(toString());

	}

	@Override
	public String toString() {
		return "CurrentConditionDisplay [temperature=" + temperature + ", humidity=" + humidity + ", pressure="
				+ pressure + "]";
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
	}

}
