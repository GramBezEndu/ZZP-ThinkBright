package Lights;

import Lights.ILight;

public class GardenLightDecorator extends LightDecorator {
    private final float power = 0.5f;
    public GardenLightDecorator(ILight light) {
        super(light);
    }
    @Override
    public void turnOn() {
        dim();
        super.turnOn();
    }
    private void dim() {
        System.out.println("Light: power set to " + power);
    }
}
