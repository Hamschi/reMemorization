import greenfoot.*;  

public class Haus extends Deko
{
    private GreenfootImage haus = new GreenfootImage("Haus.png");
    public Haus()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 50, image.getHeight() - 50);
        setImage(image);
    }
    
    
    public void act() 
    {
        
    }    
}
