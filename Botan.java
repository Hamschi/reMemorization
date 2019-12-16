import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
public class Botan extends Boss
{
    private GreenfootImage haus = new GreenfootImage("botan.png");
    
    public Botan()
    {        
        GreenfootImage image = getImage();
        image.scale(image.getWidth() + 50, image.getHeight() + 50);
        setImage(image);
    }
    
    public void act() 
    {

    }    
}
