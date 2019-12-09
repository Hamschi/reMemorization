import greenfoot.*;  


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
            } else {
                System.out.println("to ist null");
            }
        }
    }
    
    void prepare() {
        setImage(portale);
    }
}
