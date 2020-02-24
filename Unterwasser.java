import greenfoot.*;  

public class Unterwasser extends World
{
    private GreenfootSound musik = new GreenfootSound("Wasser.mp3");
    Lebensleiste lebensleiste = new Lebensleiste();

    
    public Unterwasser()
    {    
        super(600, 400, 1);
    }
    
    public Lebensleiste getLebensleiste()
    {
        return lebensleiste;
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
