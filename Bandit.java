import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class Bandit extends Actor
{
    int angriffsdauer = 300;
    int angriffsgeschwindigkeit = 1000;
    int range = 80;
    int schaden = 10;
    long letzterAngriffStart = 0;
    long letzterAngriffEnde = 0;
    int emraelRichtungX;
    int emraelRichtungY;
    Emrael emrael = null;
    boolean imAngriff = false;
    Lebensleiste lebensleiste;
    
    public Bandit(int ad, int ag, int ra, int scha)
    {
        angriffsdauer = ad;
        angriffsgeschwindigkeit = ag;
        range = ra;
        schaden = scha;
    }

    public void act() 
    {
        // Add your action code here.
        zuEmraelLaufen();
        angreifen();
        angriffFortsetzen();
        maleLebenleiste();
    }
    
    public void schadenNehmen(int schaden) {
        if (lebensleiste == null) {
            return;
        }
        lebensleiste.schaden(schaden);
        if (lebensleiste.leben <= 0) {
            getWorld().removeObject(lebensleiste);
            getWorld().removeObject(this);
        }
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
    
    private void maleLebenleiste() {
        if (getWorld() == null) {
            return;
        }
        List<Lebensleiste> leisten = getWorld().getObjects(Lebensleiste.class);
        for (int i = 0; i < leisten.size(); i++) {
            Lebensleiste leiste = (Lebensleiste)leisten.get(i);
            if (leiste.istMobLeiste() && leiste.leben > 0) { // wenn es bereits eine mob leiste gibt, zeichne keine neue
                return;
            }
        }
        if (emrael != null) { // zeichne nur, wenn der Mob Emrael im Target hat
            if (lebensleiste == null) {
                lebensleiste = new Lebensleiste(60);
                lebensleiste.setVonMob(true);
            }
            getWorld().addObject(lebensleiste, 500, 40);
        }
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
       if (emrael != null && imAngriff && (jetzt - letzterAngriffStart >= angriffsdauer)) {
           setLocation(getX() + emraelRichtungX, getY() + emraelRichtungY);
           emrael.getLebensleiste().schaden(10);
           imAngriff = false;
       }
    }
}
