import greenfoot.*;  


public class Tawerner extends Deko
{
    private GreenfootImage tawerner = new GreenfootImage("Taverne.png");
    public Tawerner()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() + 75, image.getHeight() + 40);
        setImage(image);
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
