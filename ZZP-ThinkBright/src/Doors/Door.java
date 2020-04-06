package Doors;

import Doors.IDoor;

public class Door implements IDoor {
    boolean locked;
    boolean open;
    @Override
    public void open() {
        if(!locked){
            open = true;
            System.out.println("Door: open");
        }
    }

    @Override
    public void close() {
        if(!locked){
            open = false;
            System.out.println("Door: closed");
        }
    }

    @Override
    public boolean getOpened() {
        return open;
    }

    @Override
    public void lock() {
        locked = true;
    }

    @Override
    public void unlock() {
        locked = false;
    }

    @Override
    public boolean getLocked() {
        return locked;
    }
}
