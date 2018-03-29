package Tetris;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collection;

public class Input implements KeyListener {
    private final Collection<KeyEvent> keyPressedEvents;
    private final Collection<KeyEvent> keyReleasedEvents;
    public Input() {
        keyPressedEvents = new ArrayList<>();
        keyReleasedEvents = new ArrayList<>();
    }
 //   @Override
    public void keyTyped(KeyEvent event) {
    }
 //   @Override
    public synchronized void keyPressed(KeyEvent event) {
        keyPressedEvents.add(event);
    }
    public synchronized Collection<KeyEvent> getKeyPressedEvents() {
        Collection<KeyEvent> events = new ArrayList<>(keyPressedEvents);
        keyPressedEvents.clear();
        return events;
    }
  //  @Override
    public synchronized void keyReleased(KeyEvent event) {
        keyReleasedEvents.add(event);
    }
    public synchronized Collection<KeyEvent> getKeyReleasedEvents() {
        Collection<KeyEvent> events = new ArrayList<>(keyReleasedEvents);
        keyReleasedEvents.clear();
        return events;
    }
}
