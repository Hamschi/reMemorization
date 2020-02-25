import greenfoot.*;  

public class SpielGeschafftBildschirm extends World
{
    private GreenfootSound backgroundMusic = new GreenfootSound("Ending.mp3");
    
    public SpielGeschafftBildschirm()
    {    
        super(600, 400, 1); 
        //backgroundMusic.playLoop();
    }
    
    
    public void act()
    {
    if(Greenfoot.isKeyDown("enter"))
    Greenfoot.setWorld(new Startbildschirm());
    
    }
}
