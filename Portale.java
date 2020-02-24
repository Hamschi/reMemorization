import greenfoot.*;  
import java.util.List;


public class Portale extends Actor
{
    private GreenfootImage portale = new GreenfootImage("transparent.png");
    World to;
    World from;
    int xPos;
    int yPos;
    boolean fixesPortal = false;
    
    public Portale()
    {
        prepare();
    }
    public Portale(World from, World to) {
        this.to = to;
        this.from = from;
    }
    
    public void setPortalFix(int x, int y) {
        xPos = x;
        yPos = y;
        fixesPortal = true;
    }
    
    public void act() {
        if (isTouching(Emrael.class)) {
            if (to != null) {
                uebergang();
                Greenfoot.setWorld(to);
            } else {
                System.out.println("to ist null");
            }
        }
    }
    
    protected void uebergang() {
        List<Emrael> emraels = from.getObjects(Emrael.class);
        Emrael emraelAlt = emraels.get(0);
        List<Emrael> emraelsTo = to.getObjects(Emrael.class);
        Emrael emraelNeu = emraelsTo.get(0);
        emraelNeu.phase = emraelAlt.phase;
        if (fixesPortal) {
            emraelNeu.setLocation(xPos, yPos);
        } else {
            emraelNeu.setLocation(emraelAlt.getXNachPortal(), emraelAlt.getYNachPortal());
        }
    }
    
    void prepare() {
        setImage(portale);
    }
}
