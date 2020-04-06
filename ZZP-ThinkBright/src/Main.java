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
        House myHouse = new House();
        myHouse.addHeater(new Heater());
        myHouse.addLight(new GardenLightDecorator(new Light()));
        myHouse.addLight(new HomeTheatreLightDecorator(new Light()));
        myHouse.addDoor(new GatewayDecorator(new Door(), new Light()));

        //open all doors
        myHouse.enterHouse();
        myHouse.turnOffHeaters();
        //close doors, turn off lights, turn off heaters
        myHouse.leaveHouse();
    }
}
