import greenfoot.*;
 
public class Hindernis extends Actor
{
    GreenfootImage bild;
    
    public Hindernis(String pic)
    {
        bild = new GreenfootImage(pic);
        setImage(bild);
    }
    
    public Hindernis()
    {
        bild = new GreenfootImage("transparent.png");
        setImage(bild);
    }
    
    public void mauerSkalieren()
    {
        bild.scale(bild.getWidth() + 10, bild.getHeight() + 10);
    }
}