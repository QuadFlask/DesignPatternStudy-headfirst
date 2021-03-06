package observer;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	Observable observable;
	private float temp;
	private float humidity;

	public CurrentConditionsDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	@Override
	public void update(Observable obs, Object arg) {
		if (obs instanceof WeatherData) {
			WeatherData data = (WeatherData) obs;
			this.temp = data.getTemp();
			this.humidity = data.getHumidity();
			display();
		}
	}

	@Override
	public void display() {
		System.out.println("Current condition : " + temp + "F degree and " + humidity + "% humidity");
	}

}