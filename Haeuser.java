import greenfoot.*;  

public class Haeuser extends World
{
    private GreenfootSound musik = new GreenfootSound("Schmiede.mp3");
    private GreenfootImage holzboden = new GreenfootImage("Holzboden.png");
    
    public Haeuser()
    {    
        super(600, 400, 1); 
        setBackground(holzboden);
        
    }
    public void musikAbspielen()
        {
            musik.playLoop();
        }
}
