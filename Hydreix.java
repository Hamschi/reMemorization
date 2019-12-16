import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
public class Hydreix extends Boss
{
    private GreenfootImage haus = new GreenfootImage("Hydreix.png");
    
    public Hydreix()
    {        
        GreenfootImage image = getImage();
        image.scale(image.getWidth() + 50, image.getHeight() + 50);
        setImage(image);
    }
    
    public void act() 
    {

    }    
}
