import Doors.IDoor;
import Heaters.IHeater;
import Lights.ILight;

import java.util.ArrayList;
import java.util.List;

public class House {
    private List<ILight> lightList = new ArrayList<ILight>();
    private List<IHeater> heaterList = new ArrayList<IHeater>();
    private List<IDoor> doorList = new ArrayList<IDoor>();

    public void addLight(ILight light){
        lightList.add(light);
    }

    public void addHeater(IHeater heater){
        heaterList.add(heater);
    }

    public void addDoor(IDoor door){
        doorList.add(door);
    }
    public void enterHouse(){
        openAllDoors();
        turnOnLights();
        turnOnHeaters();
    }

    public void turnOnHeaters() {
        for(var h : heaterList){
            h.setTemperature(22f);
            h.turnOn();
        }
    }

    public void turnOnLights() {
        for(var l : lightList){
            l.turnOn();
        }
    }

    public void openAllDoors() {
        for(var d: doorList){
            d.unlock();
            d.open();
        }
    }

    public void leaveHouse(){
        closeAndLockDoors();
        turnOffLights();
        turnOffHeaters();
    }

    public void turnOffHeaters() {
        for (var h : heaterList){
            h.turnOff();
        }
    }

    public void turnOffLights() {
        for (var l: lightList){
            l.turnOff();
        }
    }

    public void closeAndLockDoors() {
        for (var d: doorList) {
            d.close();
            d.lock();
        }
    }
}
