package Heaters;

public class Heater implements IHeater {
    boolean enabled;
    float temperature;
    @Override
    public void setTemperature(float temperature) {
        this.temperature = temperature;
        System.out.println("Heater: temperature set to " + this.temperature);
    }

    @Override
    public float getTemperature() {
        return temperature;
    }

    @Override
    public void turnOn() {
        enabled = true;
        System.out.println("Heater: turned on - temperature: " + temperature);
    }

    @Override
    public void turnOff() {
        enabled = false;
        System.out.println("Heater: turned off");
    }

    @Override
    public boolean getState() {
        return enabled;
    }
}
