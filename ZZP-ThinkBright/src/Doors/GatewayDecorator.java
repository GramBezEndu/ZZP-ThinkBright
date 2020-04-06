package Doors;

import Lights.ILight;

public class GatewayDecorator extends DoorDecorator {
    private ILight gatewayLight;
    public GatewayDecorator(IDoor door, ILight gatewayLight) {
        super(door);
        this.gatewayLight = gatewayLight;
    }

    @Override
    public void open() {
        gatewayLight.turnOn();
        super.open();
    }

    @Override
    public void close() {
        gatewayLight.turnOff();
        super.close();
    }
}
