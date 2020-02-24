import greenfoot.*;  

public class GameOverBildschirm extends World
{
    private GreenfootSound backgroundMusic = new GreenfootSound("GameOver.mp3");
    
    public GameOverBildschirm()
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
