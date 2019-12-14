import greenfoot.*;  
import java.util.List;


public class Portale extends Actor
{
    private GreenfootImage portale = new GreenfootImage("transparent.png");
    World to;
    World from;
    public Portale()
    {
        prepare();
    }
    public Portale(World from, World to) {
        this.to = to;
        this.from = from;
    }
    
    public void act() {
        if (isTouching(Emrael.class)) {
            if (to != null) {
                Greenfoot.setWorld(to);
                waldUebergang();
            } else {
                System.out.println("to ist null");
            }
        }
    }
    
    private void waldUebergang() {
        if (to.getClass().isInstance(Wald.class) && from.getClass().isInstance(Wald.class)) {
            List<Emrael> emraels = from.getObjects(Emrael.class);
            Emrael emraelAlt = emraels.get(0);
            List<Emrael> emraelsTo = to.getObjects(Emrael.class);
            Emrael emraelNeu = emraelsTo.get(0);
            emraelNeu.setLocation(emraelAlt.getXNachPortal(), emraelNeu.getYNachPortal());
        }
    }
    
    void prepare() {
        setImage(portale);
    }
}
