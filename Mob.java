import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Mobs here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mob extends Actor
{
    int angriffsdauer = 300;
    int angriffsgeschwindigkeit = 1000;
    int range = 80;
    long letzterAngriffStart = 0;
    long letzterAngriffEnde = 0;
    int emraelRichtungX;
    int emraelRichtungY;
    Emrael emrael = null;
    boolean imAngriff = false;
    /**
     * Act - do whatever the Mobs wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        zuEmraelLaufen();
        angreifen();
        angriffFortsetzen();
    }
    
    void setAngriffsgeschwindigkeit(int a) {
        angriffsgeschwindigkeit = a;
    }
    void setRange(int r) {
        range = r;
    }
    void setAngriffsdauer(int a) {
        angriffsdauer = 300;
    }
    
    // mobs verfolgen Emrael wenn er in Range ist
    void zuEmraelLaufen() {
        List<Emrael> intersects = getIntersectingObjects(Emrael.class);
        List<Emrael> inRange = getObjectsInRange(range, Emrael.class);
        // Wenn Emrael in Range ist oder sie ihn im Target haben, folgen sie ihm
        if (inRange.size() > 0 || emrael != null) { 
            if (emrael == null) { // Emrael ins Target setzen
                List<Emrael> emraels = getNeighbours(range, true, Emrael.class);
                emrael = emraels.get(0);
            }
            // Wenn sie schon mit ihm intersecten, dann nicht mehr folgen, damit sie nicht in ihm drin stehen
            if (intersects.size() > 0) { 
                return;
            }
            // gehe in Richtung Emrael
            int richtungX = emrael.getX() - getX();
            if (richtungX != 0) {
                richtungX = richtungX / Math.abs(richtungX) * 2;
            }
            int richtungY = getY() - emrael.getY();
            if (richtungY != 0) {
                richtungY = richtungY / Math.abs(richtungY) * 2;
            }
            setLocation(getX() + richtungX, getY() - richtungY);
        } 
     }
   
    void angreifen() {
        long jetzt = System.currentTimeMillis();
        // Wenn noch kein Angriff gestartet ist und der letzte Angriff lang genug her ist und sie Emrael im Target haben
        if (!imAngriff && jetzt - letzterAngriffStart > angriffsgeschwindigkeit && emrael != null) {
           letzterAngriffStart  = System.currentTimeMillis();
           // gehe erst von Emrael weg, um mit angriffFortsetzen() auf ihn drauf zu gehen
           emraelRichtungX = emrael.getX() - getX();
            if (emraelRichtungX != 0) {
                emraelRichtungX = emraelRichtungX / Math.abs(emraelRichtungX) * 5;
            }
           emraelRichtungY = emrael.getY() - getY();
            if (emraelRichtungY != 0) {
                emraelRichtungY = emraelRichtungY / Math.abs(emraelRichtungY) * 5;
            }
           setLocation(getX() - emraelRichtungX, getY() - emraelRichtungY);
           imAngriff = true;
        }
     }
   
    void angriffFortsetzen() {
       long jetzt = System.currentTimeMillis();
       // wenn Angriff gestartet wurde, laufe zu Emrael
       if (imAngriff && (jetzt - letzterAngriffStart >= angriffsdauer)) {
           setLocation(getX() + emraelRichtungX, getY() + emraelRichtungY);
           imAngriff = false;
       }
    }
}
