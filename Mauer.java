import greenfoot.*;  

public class Mauer extends Hindernis
{
    private GreenfootImage mauer = new GreenfootImage("ElshinMauer.png");
   
    public Mauer()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() + 10, image.getHeight() + 10);
        setImage(image);
    }
    
    public void act() 
    {

    }    
}
