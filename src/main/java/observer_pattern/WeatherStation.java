package observer_pattern;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		weatherData.setMeasurements(40.5f, 80.5f, 1000.2f);

		CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay();
		weatherData.registerObserver(currentConditionDisplay);
		currentConditionDisplay.display();

		ForecastDisplay forecastDisplay = new ForecastDisplay();
		weatherData.registerObserver(forecastDisplay);
		forecastDisplay.display();

		weatherData.measurementsChanged();
		currentConditionDisplay.display();
		forecastDisplay.display();

		System.out.println("remove currentConditionDisplay");
		
		weatherData.removeObserver(currentConditionDisplay);
		weatherData.setMeasurements(30.5f, 50.5f, 100.2f);
		weatherData.measurementsChanged();

		currentConditionDisplay.display();
		forecastDisplay.display();

	}
}
