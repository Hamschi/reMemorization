import greenfoot.*;  

public class Wald extends World
{
    private GreenfootSound musik = new GreenfootSound("Wald.mp3");
    
    
    public Wald()
    {    
        super(600, 400, 1);
    }
    
   public void musikAbspielen()
    {
        musik.playLoop();
    }
    public void musikPausieren()
    {
        musik.pause();
    }
}
