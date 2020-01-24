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
        EmraelInReichweite(emraelReichweite);
    }
    
    public void EmraelInReichweite(boolean ham)
    {
        int emraelBeruehrt= getObjectsInRange(5, Emrael.class).size();
        if(emraelBeruehrt >0)
        {
            emraelReichweite = true;
        }
        else
        {
            emraelReichweite = false;
        }
        ham = emraelReichweite;
    }
    
    private void setImageBeerenGegessen()
    {
        GreenfootImage image = new GreenfootImage("BuschOhne.png");
        setImage(image); 
    }
}