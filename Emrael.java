import greenfoot.*; 
import java.lang.*;

public class Emrael extends Actor
{
    private GreenfootImage up = new GreenfootImage("Emrael_hl.png");
    private GreenfootImage down = new GreenfootImage("Emrael_vl.png");
    private GreenfootImage left = new GreenfootImage("Emrael_lige.png");
    private GreenfootImage right = new GreenfootImage("Emrael_rege.png");
    Lebensleiste lebensleiste;
    public Phase phase;
    private int leben;
    private int schaden;
    private int schnelligkeit;
    private int rüstung;
    private boolean bewegungBlockiert;
    private long letzterAngriffStart;
    private int mobRichtungX;
    private int mobRichtungY;
    
    public Emrael() {
        lebensleiste = new Lebensleiste();
        phase = Phase.Wald1Einfuehrung;
        bewegungBlockiert = true;
        letzterAngriffStart = 0;
    }
    
    public void setBild(String bild) {
        setImage(bild);
    }
    
    public void addLebensleiste() {
        getWorld().addObject(lebensleiste, 100, 40);
        getWorld().setPaintOrder(Lebensleiste.class);
    }
    
    public Lebensleiste getLebensleiste() {
        return lebensleiste;
    }
    
    public Emrael(Emrael alterEmrael) {
        lebensleiste = new Lebensleiste(alterEmrael.getLebensleiste().getLeben());
        phase = alterEmrael.phase;
        letzterAngriffStart = 0;
    }
    
    public void setBewegungBlockiert(boolean b) {
        bewegungBlockiert = b;
    }

    private void setImage(){
        if(Greenfoot.isKeyDown("left")) 
            setImage(left);
        if(Greenfoot.isKeyDown("right"))
            setImage(right);
        if(Greenfoot.isKeyDown("up"))
            setImage(up);
        if(Greenfoot.isKeyDown("down"))
            setImage(down);
        
        if(Greenfoot.isKeyDown("a"))
        setImage(left);
        if(Greenfoot.isKeyDown("d"))
            setImage(right);
        if(Greenfoot.isKeyDown("w"))
            setImage(up);
        if(Greenfoot.isKeyDown("s"))
            setImage(down);
    }

    public void act(){
        if (bewegungBlockiert) 
            return;
            
        setImage();
        int lastX = getX();
        int lastY = getY();
        // bewegen
        if(Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("a"))
            setLocation(getX()-3, getY());
        if(Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("d"))
            setLocation(getX()+3, getY());
        if(Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("w"))
            setLocation(getX(), getY()-3);
        if(Greenfoot.isKeyDown("down") || Greenfoot.isKeyDown("s"))
            setLocation(getX(), getY()+3);
        // Position zuruecksetzen bei einem Hindernis
        boolean istAmRand = (getY()<16 || getY()>382 || getX()<17 || getX()>583);
        if (isTouching(Hindernis.class) || isTouching(NPC.class) || istAmRand) 
        {
            setLocation(lastX, lastY);
        }
        // angreifen
        if (isTouching(Mob.class) && Greenfoot.isKeyDown("1")) {
            angreifen((Mob)getOneIntersectingObject(Mob.class));
        }
        angriffFortsetzen();
        
   }
   
   public void angreifen(Mob mob) {
       // wenn ein Mob in der Nähe ist und noch kein Angriff gestartet wurde, starte den Angriff
       if (intersects(mob) && letzterAngriffStart == 0) {
           letzterAngriffStart  = System.currentTimeMillis();
           mobRichtungX = mob.getX() - getX();
           mobRichtungY = mob.getY() - getY();
           setLocation(getX() - mobRichtungX, getY() - mobRichtungY);
       }
   }
   
   public void angriffFortsetzen() {
       long jetzt = System.currentTimeMillis();
       // wenn Angriff gestartet wurde, lasse Emrael zum Mob laufen
       if (letzterAngriffStart != 0 && (jetzt - letzterAngriffStart >= 300)) {
           setLocation(getX() + mobRichtungX, getY() + mobRichtungY);
           letzterAngriffStart = 0;
       }
   }
   
   public int getXNachPortal() {
       if (getX() < 60)
           return 540;
       if  (getX() > 540)
           return 60;
       return getX();
    }
    
   public int getYNachPortal() {
       if (getY() < 60)
           return 340;
       if (getY() > 340)
           return 60;
       return getY();
    }

    public enum Phase {
        Wald1Einfuehrung,
        ErsterHuettenbesuch,
        Wald2VorMobs,
        Wald2Tutorial,
        Wald2Beeren,
        WaldBeerenGegessen,
        WaldBeerenErklaert
    }
}
