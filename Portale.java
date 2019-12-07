import greenfoot.*;  


public class Portale extends Actor
{
    private GreenfootImage portale = new GreenfootImage("transparent.png");
    public Portale()
    {
        setImage(portale);
    }
    
    public void act() {
        if (isTouching(Emrael.class))
            Greenfoot.setWorld(new Wald());
    }
}
