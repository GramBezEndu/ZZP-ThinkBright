package Doors;

public interface IDoor {
    void open();
    void close();
    boolean getOpened();
    void lock();
    void unlock();
    boolean getLocked();
}
