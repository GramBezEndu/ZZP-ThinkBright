import Doors.Door;
import Doors.GatewayDecorator;
import Doors.IDoor;
import Heaters.Heater;
import Lights.GardenLightDecorator;
import Lights.HomeTheatreLightDecorator;
import Lights.ILight;
import Lights.Light;

public class Main {

    public static void main(String[] args) {
        Heater();
        GardenLights();
        TheatreLights();
        Gateway();
    }

    private static void Gateway() {
        System.out.println("Gateway:");
        IDoor gateway = new GatewayDecorator(new Door(), new Light());
        gateway.open();
        gateway.close();
        System.out.println();
    }

    private static void Heater() {
        System.out.println("Heater:");
        Heater heater = new Heater();
        heater.setTemperature(22f);
        heater.turnOn();
        heater.turnOff();
        System.out.println();
    }

    private static void GardenLights() {
        System.out.println("Garden lights:");
        ILight gardenLight = new GardenLightDecorator(new Light());
        gardenLight.turnOn();
        gardenLight.turnOff();
        System.out.println();
    }

    private static void TheatreLights() {
        System.out.println("Home theatre lights:");
        ILight homeTheatreLight = new HomeTheatreLightDecorator(new Light());
        homeTheatreLight.turnOn();
        homeTheatreLight.turnOff();
        System.out.println();
    }
}
