import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class Yadrin extends Actor
{
    int angriffsdauer = 300;
    int angriffsgeschwindigkeit = 1000;
    int range = 80;
    int schaden = 10;
    int leben = 60;
    long letzterAngriffStart = 0;
    long letzterAngriffEnde = 0;
    int emraelRichtungX;
    int emraelRichtungY;
    Emrael emrael = null;
    boolean imAngriff = false;
    Lebensleiste lebensleiste;
    
    public Yadrin(String pic)
    {
        setImage(new GreenfootImage(pic));

    }

    public void act() 
    {
        // Add your action code here.
        zuEmraelLaufen();
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
   

     
}
