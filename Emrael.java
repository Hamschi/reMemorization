import greenfoot.*; 

public class Emrael extends Actor
{

    private GreenfootImage up = new GreenfootImage("Emrael_hl.png");
    private GreenfootImage down = new GreenfootImage("Emrael_vl.png");
    private GreenfootImage left = new GreenfootImage("Emrael_lige.png");
    private GreenfootImage right = new GreenfootImage("Emrael_rege.png");
    private int leben;
    private int schaden;
    private int schnelligkeit;
    private int rüstung;
    
    public void act() 
    {
        bewegungSpieler();
    }    
    
    
    public void bewegungSpieler()
    {
        if(Greenfoot.isKeyDown("left")) 
            setImage(left);
        if(Greenfoot.isKeyDown("left"))
            setLocation(getX()-3, getY());
        if(Greenfoot.isKeyDown("right"))
            setImage(right);
        if(Greenfoot.isKeyDown("right"))
            setLocation(getX()+3, getY());
        if(Greenfoot.isKeyDown("up"))
            setImage(up);
        if(Greenfoot.isKeyDown("up"))
            setLocation(getX(), getY()-3);
        if(Greenfoot.isKeyDown("down"))
            setImage(down);
        if(Greenfoot.isKeyDown("down"))
            setLocation(getX(), getY()+3);
            
        if(Greenfoot.isKeyDown("a"))
        setImage(left);
        if(Greenfoot.isKeyDown("a"))
            setLocation(getX()-3, getY());
        if(Greenfoot.isKeyDown("d"))
            setImage(right);
        if(Greenfoot.isKeyDown("d"))
            setLocation(getX()+3, getY());
        if(Greenfoot.isKeyDown("w"))
            setImage(up);
        if(Greenfoot.isKeyDown("w"))
            setLocation(getX(), getY()-3);
        if(Greenfoot.isKeyDown("s"))
            setImage(down);
        if(Greenfoot.isKeyDown("s"))
            setLocation(getX(), getY()+3);
    }
}
