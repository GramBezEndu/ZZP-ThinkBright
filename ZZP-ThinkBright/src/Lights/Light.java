package Lights;

import Lights.ILight;

public class Light implements ILight {
    boolean enabled;
    @Override
    public void turnOn() {
        enabled = true;
        System.out.println("Light: turned on");
    }

    @Override
    public void turnOff() {
        enabled = false;
        System.out.println("Light: turned off");
    }

    @Override
    public boolean getState() {
        return enabled;
    }
}
