import greenfoot.*;  

public class Unterwasser extends World
{
    private GreenfootSound backgroundMusic = new GreenfootSound("Wasser.mp3");
    Lebensleiste lebensleiste = new Lebensleiste();

    
    public Unterwasser()
    {    
        super(600, 400, 1);
        //backgroundMusic.playLoop();
    }
    
    public Lebensleiste getLebensleiste()
    {
        return lebensleiste;
    }
 
}
