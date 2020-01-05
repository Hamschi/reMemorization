import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
public class Hydreix extends Boss
{
    private GreenfootImage haus = new GreenfootImage("Hydreix.png");
    
    public Hydreix()
    {        
        GreenfootImage hydreix = getImage();
        hydreix.scale(hydreix.getWidth() + 50, hydreix.getHeight() + 50);
        setImage(hydreix);
    }
    
    public void act() 
    {

    }    
}
