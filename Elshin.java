import greenfoot.*;  

public class Elshin extends World
{
    private GreenfootSound backgroundMusic = new GreenfootSound("Elshin.mp3");
    Lebensleiste lebensleiste = new Lebensleiste();
    
    public Elshin()
    {    
        super(600, 400, 1);
        //backgroundMusic.playLoop();
        prepare();
    }
    
    public Lebensleiste getLebensleiste()
    {
        return lebensleiste;
    }
    
    private void prepare()
    {
    }
}
