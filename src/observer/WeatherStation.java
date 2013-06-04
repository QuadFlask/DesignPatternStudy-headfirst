package observer;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData data = new WeatherData();

		CurrentConditionsDisplay d = new CurrentConditionsDisplay(data);

		data.setMeasurements(12, 13, 14);
		data.setMeasurements(13, 15, 17);
		data.setMeasurements(14, 16, 18);
	}
}
