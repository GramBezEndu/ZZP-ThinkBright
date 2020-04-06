package Lights;

import Lights.ILight;

public abstract class LightDecorator implements ILight {
    private ILight light;
    public LightDecorator(ILight light) {
        this.light = light;
    }

    @Override
    public void turnOn() {
        light.turnOn();
    }
    @Override
    public void turnOff() {
        light.turnOff();
    }
    @Override
    public boolean getState() {
        return light.getState();
    }
}
