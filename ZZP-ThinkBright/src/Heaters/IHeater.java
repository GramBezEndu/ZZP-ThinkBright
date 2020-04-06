package Heaters;

public interface IHeater {
    void turnOn();
    void turnOff();
    boolean getState();
    void setTemperature(float temperature);
    float getTemperature();
}
