package Doors;

public abstract class DoorDecorator implements IDoor {
    IDoor decoratedDoor;

    public DoorDecorator(IDoor door) {
        decoratedDoor = door;
    }

    @Override
    public boolean getLocked() {
        return decoratedDoor.getLocked();
    }

    @Override
    public boolean getOpened() {
        return decoratedDoor.getOpened();
    }

    @Override
    public void close() {
        decoratedDoor.close();
    }

    @Override
    public void lock() {
        decoratedDoor.lock();
    }

    @Override
    public void open() {
        decoratedDoor.open();
    }

    @Override
    public void unlock() {
        decoratedDoor.unlock();
    }
}
