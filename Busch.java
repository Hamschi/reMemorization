import greenfoot.*;  

public class Busch extends Actor
{
    private boolean emraelReichweite;
    
    public Busch()
    {
        GreenfootImage image = new GreenfootImage("Busch.png");
        setImage(image); 
    }
    
    public void act() 
    {
    }
    
    
    private void setImageBeerenGegessen()
    {
        GreenfootImage image = new GreenfootImage("BuschOhne.png");
        setImage(image); 
    }
}