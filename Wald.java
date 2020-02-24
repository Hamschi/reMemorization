import greenfoot.*;  

public class Wald extends World
{
    private GreenfootSound musik = new GreenfootSound("Wald.mp3");
    
    
    public Wald()
    {    
        super(600, 400, 1);
        //backgroundMusic.playLoop();
    }
    
   public void musikAbspielen()
        {
            musik.playLoop();
        }
}
