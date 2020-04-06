package Lights;

import Lights.ILight;
import Lights.LightDecorator;

import java.awt.*;

public class HomeTheatreLightDecorator extends LightDecorator {
    private Color lightColor = Color.BLUE;
    public HomeTheatreLightDecorator(ILight light) {
        super(light);
    }
    @Override
    public void turnOn() {
        applyLightColor();
        applyDynamicLight();
        super.turnOn();
    }

    private void applyLightColor() {
        System.out.println("Light: Color applied: " + lightColor.getRGB());
    }

    private void applyDynamicLight() {
        System.out.println("Light: Dynamic lights turned on");
    }
}
