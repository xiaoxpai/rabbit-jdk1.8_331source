package cn.alex.pattern;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Alex
 */
public class CurrentCoditionsDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentCoditionsDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    /**
     * 当x需要被显示时，调用此方法
     */
    @Override
    public void display() {
        System.out.println(
                "Current condition:" + temperature +
                "F degress and " + humidity +
                " % humidity"
        );
    }

    /**
     * This method is called whenever the observed object is changed. An
     * application calls an <tt>Observable</tt> object's
     * <code>notifyObservers</code> method to have all the object's
     * observers notified of the change.
     *
     * @param o   the observable object.
     * @param arg an argument passed to the <code>notifyObservers</code>
     *            method.
     */
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

}
